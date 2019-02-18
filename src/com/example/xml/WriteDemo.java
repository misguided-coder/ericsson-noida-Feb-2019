package com.example.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class WriteDemo {
	
	public static void main(String[] args) {
		
		Car car = new Car(1, "XE", "Jaguar", 99999900.00, "Yellow");
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Car.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(car, new FileOutputStream("./files/car.xml"));
			System.out.println("Writing done!!!!!");
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
