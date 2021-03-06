package com.hm.engine.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericsUtils {
	@SuppressWarnings("rawtypes")
	public static Class getSuperClassGenricType(Class clazz, int index) {
		Type genType = clazz.getGenericSuperclass();

		if (!(genType instanceof ParameterizedType)) {
			return Object.class;
		}

		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		if ((index >= params.length) || (index < 0)) {
			throw new RuntimeException("你输入的索引"
					+ (index < 0 ? "不能小于0" : "超出了参数的总数"));
		}
		if (!(params[index] instanceof Class)) {
			return Object.class;
		}
		return (Class) params[index];
	}

	@SuppressWarnings("rawtypes")
	public static Class getSuperClassGenricType(Class clazz) {
		return getSuperClassGenricType(clazz, 0);
	}

	/*
	 * If more than one interface may be the return type is not the type of
	 * required
	 */
	public static Class<?> getMethodParameterGenericsInterfaceType(Object req) {
		ParameterizedType parameterizedType = null;
		try {
			parameterizedType = (ParameterizedType) (req.getClass()
					.getGenericInterfaces()[0]);
		} catch (Exception e) {
			return getSuperClassGenricType(req.getClass());
		}
		return (Class<?>) parameterizedType.getActualTypeArguments()[0];
	}
	// public static Class getMethodGenericReturnType(Method method, int index)
	// {
	// Type returnType = method.getGenericReturnType();
	// if ((returnType instanceof ParameterizedType)) {
	// ParameterizedType type = (ParameterizedType)returnType;
	// Type[] typeArguments = type.getActualTypeArguments();
	// if ((index >= typeArguments.length) || (index < 0)) {
	// throw new RuntimeException("你输入的索引" + (index < 0 ? "不能小于0" :
	// "超出了参数的总数"));
	// }
	// return (Class)typeArguments[index];
	// }
	// return Object.class;
	// }
	//
	// public static Class getMethodGenericReturnType(Method method)
	// {
	// return getMethodGenericReturnType(method, 0);
	// }
	//
	// public static List<Class> getMethodGenericParameterTypes(Method method,
	// int index)
	// {
	// List results = new ArrayList();
	// Type[] genericParameterTypes = method.getGenericParameterTypes();
	// if ((index >= genericParameterTypes.length) || (index < 0)) {
	// throw new RuntimeException("你输入的索引" + (index < 0 ? "不能小于0" :
	// "超出了参数的总数"));
	// }
	// Type genericParameterType = genericParameterTypes[index];
	// if ((genericParameterType instanceof ParameterizedType)) {
	// ParameterizedType aType = (ParameterizedType)genericParameterType; Type[]
	// parameterArgTypes = aType.getActualTypeArguments();
	// for (Type parameterArgType : parameterArgTypes) {
	// Class parameterArgClass = (Class)parameterArgType;
	// results.add(parameterArgClass);
	// }
	// return results;
	// }
	// return results;
	// }
	//
	// public static List<Class> getMethodGenericParameterTypes(Method method)
	// {
	// return getMethodGenericParameterTypes(method, 0);
	// }
	//
	// public static Class getFieldGenericType(Field field, int index)
	// {
	// Type genericFieldType = field.getGenericType();
	//
	// if ((genericFieldType instanceof ParameterizedType)) {
	// ParameterizedType aType = (ParameterizedType)genericFieldType;
	// Type[] fieldArgTypes = aType.getActualTypeArguments();
	// if ((index >= fieldArgTypes.length) || (index < 0)) {
	// throw new RuntimeException("你输入的索引" + (index < 0 ? "不能小于0" :
	// "超出了参数的总数"));
	// }
	// return (Class)fieldArgTypes[index];
	// }
	// return Object.class;
	// }
	//
	// public static Class getFieldGenericType(Field field)
	// {
	// return getFieldGenericType(field, 0);
	// }
}
