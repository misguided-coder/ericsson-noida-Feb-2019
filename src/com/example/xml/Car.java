package com.example.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "car")
public class Car {

	@XmlAttribute(name = "vin")
	int vin;

	@XmlElement(name = "model")
	String model;

	@XmlElement(name = "make")
	String make;

	@XmlElement(name = "price")
	double price;

	@XmlElement(name = "color")
	String color;

	public Car() {
	}

	public Car(int vin, String model, String make, double price, String color) {
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.price = price;
		this.color = color;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [vin=" + vin + ", model=" + model + ", make=" + make + ", price=" + price + ", color=" + color
				+ "]";
	}

}
