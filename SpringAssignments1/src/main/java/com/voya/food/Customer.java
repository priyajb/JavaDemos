package com.voya.food;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext("com.voya.food");
		Waiter waiter=(Waiter) context.getBean("waiter");
		List<String> foodList=waiter.viewMenuCard("indian");
		for (String food : foodList) {
			System.out.println(food);
		}
	}

}
