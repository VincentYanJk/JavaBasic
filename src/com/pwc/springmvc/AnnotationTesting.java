package com.pwc.springmvc;

import java.lang.reflect.Method;

import com.pwc.springmvc.annotation.Controller;
import com.pwc.springmvc.annotation.RequestMapping;
import com.pwc.springmvc.controller.IndexController;

public class AnnotationTesting {
  
	public static void main(String[] args) {

		Class clazz = IndexController.class;

		if (clazz.isAnnotationPresent(Controller.class)) {
			System.out.println(clazz.getName() + " this class is marked Controller.");

			String path = "";

			if (clazz.isAnnotationPresent(RequestMapping.class)) {
				RequestMapping requestMapping = (RequestMapping) clazz.getAnnotation(RequestMapping.class);
				path = requestMapping.value();
			}

			Method[] methods = clazz.getMethods();

			for (Method method : methods) {

				if (!method.isAnnotationPresent(RequestMapping.class)) {
					continue;
				}

				System.out.println("print each of url of method: " + path + method.getAnnotation(RequestMapping.class).value());

				
				
			}

		}

	}

}
