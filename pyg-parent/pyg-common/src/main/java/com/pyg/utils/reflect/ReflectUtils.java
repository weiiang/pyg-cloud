package com.pyg.utils.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.pyg.utils.date.DateFormatUtils;
import com.pyg.utils.date.DateUtils;

public class ReflectUtils {
	
	/**
	 * 通过反射得到字段对应的set方法
	 * @param 类字节码
	 * @return	返回属性->set方法的Map结构
	 */
	public static Map<String, Method> getObjectSetterMethod(@SuppressWarnings("rawtypes") Class object) {
		Field[] fields = object.getDeclaredFields(); // 获取object对象的所有属性
		Method[] methods = object.getDeclaredMethods(); // 获取object对象的所有方法
		Map<String, Method> methodMap = new HashMap<String, Method>();
		for (Field field : fields) {
			String attri = field.getName();
			for (Method method : methods) {
				String meth = method.getName();
				// 匹配set方法
				if (meth != null && "set".equals(meth.substring(0, 3)) && Modifier.isPublic(method.getModifiers())
						&& ("set" + Character.toUpperCase(attri.charAt(0)) + attri.substring(1)).equals(meth)) {
					methodMap.put(attri.toLowerCase(), method); // 将匹配的setter方法加入map对象中
					break;
				}
			}
		}

		return methodMap;
	}

	/**
	 * Map接口:属性名大写<-->属性名
	 * @param object 类的字节码
	 * @return
	 */
	public static Map<String, Field> getObjectField(Class object) {
		Field[] fields = object.getDeclaredFields(); // 获取object对象的所有属性
		Map<String, Field> fieldMap = new HashMap<String, Field>();
		for (Field field : fields) {
			String attri = field.getName();
			fieldMap.put(attri.toLowerCase(), field);
		}
		return fieldMap;
	}
	
	public static void setObjectPropertyValue(Object obj, Field field, Method method, String value) throws Exception {
		Object[] oo = new Object[1];

		String type = field.getType().getName();
		if ("java.lang.String".equals(type) || "String".equals(type)) {
			oo[0] = value;
		} else if ("java.lang.Integer".equals(type) || "java.lang.int".equals(type) || "Integer".equals(type)
				|| "int".equals(type)) {
			if (value.length() > 0)
				oo[0] = Integer.valueOf(value);
		} else if ("java.lang.Float".equals(type) || "java.lang.float".equals(type) || "Float".equals(type)
				|| "float".equals(type)) {
			if (value.length() > 0)
				oo[0] = Float.valueOf(value);
		} else if ("java.lang.Double".equals(type) || "java.lang.double".equals(type) || "Double".equals(type)
				|| "double".equals(type)) {
			if (value.length() > 0)
				oo[0] = Double.valueOf(value);
		} else if ("java.math.BigDecimal".equals(type) || "BigDecimal".equals(type)) {
			if (value.length() > 0)
				oo[0] = new BigDecimal(value);
		} else if ("java.util.Date".equals(type) || "Date".equals(type)) {
			if (value.length() > 0) {// 当长度为19(yyyy-MM-dd
										// HH24:mm:ss)或者为14(yyyyMMddHH24mmss)时Date格式转换为yyyyMMddHH24mmss
				if (value.length() == 19 || value.length() == 14) {
					oo[0] = DateUtils.string2Date(value, "yyyyMMddHH24mmss");
				} else {
					// 其余全部转换为yyyyMMdd格式
					oo[0] = DateUtils.string2Date(value, "yyyyMMdd");
				}
			}
		} else if ("java.sql.Timestamp".equals(type)) {
			if (value.length() > 0)
				oo[0] = DateFormatUtils.formatDate(value, "yyyyMMddHH24mmss");
		} else if ("java.lang.Boolean".equals(type) || "Boolean".equals(type)) {
			if (value.length() > 0)
				oo[0] = Boolean.valueOf(value);
		} else if ("java.lang.Long".equals(type) || "java.lang.long".equals(type) || "Long".equals(type)
				|| "long".equals(type)) {
			if (value.length() > 0)
				oo[0] = Long.valueOf(value);
		}
		try {
			method.invoke(obj, oo);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
