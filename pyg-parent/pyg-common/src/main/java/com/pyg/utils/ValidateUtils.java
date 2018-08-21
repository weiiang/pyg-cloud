package com.pyg.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidateUtils {
	
	private static Logger logger = LoggerFactory.getLogger(ValidateUtils.class);
	
	/**
	 * 根据文件的文件名校验是否为Excel文件，包含2007和2003
	 * @param fileName	文件名（全名）
	 * @return
	 */
	public static boolean isExcel(String fileName) {
		boolean flag = false;
		String extName = fileName.substring(fileName.lastIndexOf(".")+1);
		logger.info(" [文件扩展名: "+extName+" ]");
		if("xls".equals(extName) || "xlsx".equals(extName)) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * 根据文件的全名判断是否是Excel2003文件
	 * @param fileName	文件名
	 * @return
	 */
	public static boolean isExcel2003(String fileName) {
		boolean flag = false;
		String extName = fileName.substring(fileName.lastIndexOf(".")+1);
		if("xls".equals(extName)) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * 根据文件的全名判断是否是Excel2007文件
	 * @param fileName	文件名
	 * @return
	 */
	public static boolean isExcel2007(String fileName) {
		boolean flag = false;
		String extName = fileName.substring(fileName.lastIndexOf(".")+1);
		if("xlsx".equals(extName)) {
			flag = true;
		}
		return flag;
	}

}
