package com.example.ex;

//Developer 1
public class CinemaService {
	
	public void watchMovie(String name,int age) throws Exception {
			if(age <= 12) {
				String message = "Mr. "+name+", you are too young, go home!!!!";
				throw new Exception(message);
			}
			System.out.printf("Mr %s, enjoy movie with popcorn!!!!",name);
	}
	

}
