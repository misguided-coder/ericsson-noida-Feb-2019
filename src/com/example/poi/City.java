package com.example.poi;

public class City {

	String title;
	int population;

	public City() {
	}

	public City(String title, int population) {
		this.title = title;
		this.population = population;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
