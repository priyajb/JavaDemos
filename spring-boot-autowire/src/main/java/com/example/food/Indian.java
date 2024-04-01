package com.example.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

public class Indian implements IFoodMenu {

	public List<String> showItems() {
		
		return Arrays.asList("idli","dosa","pulivogare");
	}

}
