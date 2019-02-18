package com.example.collection;

public class Car implements Comparable<Car> {

	private int vin;
	private String model;
	private String make;
	private int speed;
	private double price;
	private String color;

	public Car(int vin, String model, String make, int speed, double price, String color) {
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.speed = speed;
		this.price = price;
		this.color = color;
	}

	public int getVin() {
		return vin;
	}

	public String getModel() {
		return model;
	}

	public String getMake() {
		return make;
	}

	public int getSpeed() {
		return speed;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	@Override
	public int compareTo(Car other) {
		if(this.vin == other.vin)
			return 0;
		if(this.vin > other.vin)
			return 1;
		
		return -1;
	}

	
	@Override
	public String toString() {
		return "Car [vin=" + vin + ", model=" + model + ", make=" + make + ", speed=" + speed + ", price=" + price
				+ ", color=" + color + "]";
	}
	
}
