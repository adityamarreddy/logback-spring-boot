package org.avr.loggingdemo;

import java.lang.reflect.InvocationTargetException;

import org.avr.loggingdemo.helper.Course;

public class TestRef {

	public static void testRef() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		RefUtil.main(new Course());
		
	}
}
