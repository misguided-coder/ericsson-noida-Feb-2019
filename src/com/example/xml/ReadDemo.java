package com.example.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ReadDemo {
	
	public static void main(String[] args) {
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(CarList.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			CarList carList = (CarList)unmarshaller.unmarshal(new FileInputStream("./files/cars.xml"));
			System.out.println(carList.cars);
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
