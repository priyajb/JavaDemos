package com.voya.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	Integer vehicleId;
	String model;
	String brand;
	double price;

	Engine engine;

	public Integer getVehicleId() {
		return vehicleId;
	}

	@Value("1")
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getModel() {
		return model;
	}

	@Value("tata")
	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	@Value("xuv")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	@Value("300000")
	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", model=" + model + ", brand=" + brand + ", price=" + price
				+ ", engine=" + engine + "]";
	}

}
