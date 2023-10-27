package com.aeld.user.reflexion.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestApplicationService {

	public static void main(String[] args) throws Exception {
		Class<?> className = Class.forName("com.aeld.user.reflection.ApplicationService");
		Constructor<?> constructor = className.getDeclaredConstructor();
		System.out.println(constructor);
		constructor.setAccessible(true);
		Object instance = constructor.newInstance();
		Method[] methods = className.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
			if (method.getName().equals("sayHello")) {
				method.setAccessible(true);
				method.invoke(instance);
			}
		}
		//ApplicationService service = new ApplicationService();
	}

}
