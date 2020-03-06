package org.avr.loggingdemo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//import java.lang.reflect.Modifier;


public class RefUtil {
	public static <T> void main(T t) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, SecurityException {
		Class<? extends T> class1 = (Class<? extends T>) t.getClass();
		Field[] fields = class1.getDeclaredFields();
		for (Field f : fields) {
//			System.out
//					.println(f.getType().isPrimitive() + ":" + f.getName() + ":" + Modifier.toString(f.getModifiers()));
			String convertToTitleCaseIteratingChars = ConvertVariableToTitleCase.convertToTitleCaseIteratingChars(f.getName());
			Method setMethod;
			try {
				System.out.println("Invoking set" + convertToTitleCaseIteratingChars+" on "+class1);
				setMethod = class1.getDeclaredMethod("set" +convertToTitleCaseIteratingChars ,
						f.getType());
				setMethod.invoke(t,
						f.getType().isPrimitive() ? PrimitiveDefaults.getDefaultValue(f.getType().getClass()) : null);
			} catch (NoSuchMethodException e) {
				System.out.println("set" + convertToTitleCaseIteratingChars +" is not available on "+class1);

			}
			Method getMethod;
			try {
				System.out.println("Invoking get" + convertToTitleCaseIteratingChars+" on "+class1);

				getMethod = class1.getDeclaredMethod("get" + convertToTitleCaseIteratingChars);
				getMethod.invoke(t);
			} catch (NoSuchMethodException e) {
				System.out.println("get" + convertToTitleCaseIteratingChars +" is not available on "+class1);
			}
			

		}

	}

	
}