package com.example.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape {

	@Override
	public void area(int x, int y) {
		int Triangle=(1/2)*x*y;
		System.out.println(Triangle);
		
	}

}
