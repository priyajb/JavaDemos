package com.voya.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements IInstruments{
	public void play(String song) {
		
		System.out.println("playing this " +song+ "using guitar");
	}

}
