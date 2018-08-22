package com.pyg.utils.excel;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.pyg.entity.Result;
import com.pyg.utils.ValidateUtils;
import com.pyg.utils.date.DateFormatUtils;
import com.pyg.utils.reflect.ReflectUtils;

public class ExcelReadUtils {

	private static Logger logger = LoggerFactory.getLogger(ExcelReadUtils.class);

	@SuppressWarnings("resource")
	public static Result getExcelList(String fileName, MultipartFile file, Class<?> brand, String[] properties) {
		InputStream in = null;
		Workbook wb = null;
		try {
			in = file.getInputStream();
		} catch (IOException e) {
			logger.error("创建输入流失败...");
			return Result.failure(500, "导入Excel创建输入流失败...\n" + e.getMessage());
		}
		boolean isExcel2003 = ValidateUtils.isExcel2003(fileName);
		if (isExcel2003) {
			try {
				wb = new HSSFWorkbook(in);
			} catch (IOException e) {
				logger.error("创建Excel2003 WorkBook失败...\n" + e.getMessage());
				return Result.failure(500, "导入Excel创建Excel2003 WorkBook失败...");
			}
		} else {
			try {
				wb = new XSSFWorkbook(in);
			} catch (IOException e) {
				logger.error("创建Excel2007 WorkBook失败...\n" + e.getMessage());
				return Result.failure(500, "导入Excel创建Excel2007 WorkBook失败...");
			}
		}
		// 获取第一列的表格
		Sheet sheet = wb.getSheetAt(0);
		// 遍历行
		Map<String, Method> methodMap = ReflectUtils.getObjectSetterMethod(brand);
		Map<String, Field> fieldMap = ReflectUtils.getObjectField(brand);
		List<Object> tbList = new ArrayList<>();
		for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
			Object brandInstance = null;
			try {
				brandInstance = brand.newInstance();
			} catch (Exception e) {
				return Result.failure(500, "反射生成实例失败!\n" + e.getMessage());
			}
			Row row = sheet.getRow(i);
			if (row == null)
				continue;
			// 遍历列
			for (int j = 0; j < properties.length; j++) {// 第0行是表头
				Cell cell = row.getCell(j);
				if (cell == null) {
					continue;
				}
				String cellValue = getCellValue(cell);
				String property = properties[j].toLowerCase();
				Field field = fieldMap.get(property); // 该property在object对象中对应的属性
				Method method = methodMap.get(property); // 该property在object对象中对应的setter方法
				try {
					ReflectUtils.setObjectPropertyValue(brandInstance, field, method, cellValue);
				} catch (Exception e) {
					logger.error("反射属性赋值失败...\n"+e.getMessage());
					return Result.failure(500, "反射属性赋值失败...");
				}
			}
			tbList.add(brandInstance);

		}
		return Result.success(tbList);
	}

	private static String getCellValue(Cell cell) {
		String cellValue = "";
		CellType type = cell.getCellTypeEnum();
		if (type == CellType.STRING) {
			cellValue = cell.getStringCellValue();
		} else if (type == CellType._NONE) {
			boolean flag = cell.getBooleanCellValue();
			if (flag) {
				cellValue = "1";
			} else {
				cellValue = "0";
			}
		} else if (type == CellType.BLANK) {

		} else if (type == CellType.BOOLEAN) {
			cellValue = String.valueOf(cell.getBooleanCellValue());
		} else if (type == CellType.ERROR) {

		} else if (type == CellType.FORMULA) {
			cellValue = cell.getCellFormula();
		} else if (type == CellType.NUMERIC) {
			// 判断日期和数字
			if (HSSFDateUtil.isCellDateFormatted(cell)) {
				// 是日期格式
				Date date = cell.getDateCellValue();
				cellValue = DateFormatUtils.formatDate(date, "yyyy-MM-dd HH:mm:ss");
			} else {
				// 将所有的数字类型都转换成String类型
				cellValue = NumberToTextConverter.toText(cell.getNumericCellValue());
			}

		}
		return cellValue;
	}
}
