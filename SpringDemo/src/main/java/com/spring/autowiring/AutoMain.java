package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AutoMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.spring.autowiring");
		ShapeFactory shapeFactory= context.getBean(ShapeFactory.class);
		shapeFactory.printArea("t", 2, 3);
		shapeFactory.printArea("s", 2, 3);
		shapeFactory.printArea("r", 2, 3);

	}

}
