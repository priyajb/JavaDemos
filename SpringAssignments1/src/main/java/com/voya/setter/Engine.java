package com.voya.setter;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	int capacity;
	String type;

	public int getCapacity() {
		return capacity;
	}

	@Value("350")
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	@Value("petrol")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + "]";
	}
	

}
