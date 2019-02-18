package com.example.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cars")
public class CarList {

	@XmlElement(name="car")
	List<Car> cars = new ArrayList<>();

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

}
