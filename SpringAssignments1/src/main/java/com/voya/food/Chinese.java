package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

public class Chinese implements IFoodMenu {

	public List<String> showItems() {
		
		return Arrays.asList("noodles","chicken","maggie");
	}

}
