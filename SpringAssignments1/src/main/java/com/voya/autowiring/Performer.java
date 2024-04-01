package com.voya.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	@Autowired
	private IInstruments violin;
	@Autowired
	private IInstruments guitar;
	@Autowired
	private IInstruments keyboard;
	
	
	public IInstruments getViolin() {
		return violin;
	}


	public void setViolin(IInstruments violin) {
		this.violin = violin;
	}


	public IInstruments getGuitar() {
		return guitar;
	}


	public void setGuitar(IInstruments guitar) {
		this.guitar = guitar;
	}


	public IInstruments getKeyboard() {
		return keyboard;
	}


	public void setKeyboard(IInstruments keyboard) {
		this.keyboard = keyboard;
	}


	public void playSong(String type,String song) {
		if(type.equals("violin"));
		violin.play(song);
		if(type.equals("guitar"));
		guitar.play(song);
		if(type.equals("keyboard"));
		keyboard.play(song);
			
	}

}
