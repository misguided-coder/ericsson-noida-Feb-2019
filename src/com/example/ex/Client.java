package com.example.ex;

//Developer 2
public class Client {
	
	public static void main(String[] args) {
		CinemaService cinemaService = new CinemaService();
		try {
			cinemaService.watchMovie("Jaggu", 18);
			System.out.println("Movie Done!!!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
