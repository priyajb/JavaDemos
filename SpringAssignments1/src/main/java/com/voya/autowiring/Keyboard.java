package com.voya.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Keyboard implements IInstruments {

	public void play(String song) {
		
		System.out.println("playing this " +song+ "using keyboard");
	}

}
