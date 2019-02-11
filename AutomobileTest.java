interface Automobile {
	void start();
	void stop();
}

interface Acceleratable {
	void accelerate();
}

interface Brakable {
	void applyBrake();
}

interface Repairable {
	void doRepair();
}

interface Washable {
	void doWash();
}

abstract class Vehicle implements Automobile {

	public void stop() {
		System.out.println("Vehicle stopped!!!!");
	}
}

class Car extends Vehicle implements Acceleratable,Brakable {
	public void start() {
		System.out.println("Car started manually using Key!!!!");
	}

	public void accelerate(){
		System.out.println("Car is speeding up!!!!");
	}

	public void applyBrake(){
		System.out.println("Car is speeding down!!!!");
	}

}


class LuxuryCar extends Car {
	public void start() {
		System.out.println("LuxuryCar started with voice command!!!!");
	}
}



class Bus extends Vehicle implements Acceleratable,Washable,Repairable {
	public void start() {
		System.out.println("Bus started manually using Key!!!!");
	}

	public void accelerate(){
		System.out.println("Bus is speeding up!!!!");
	}

	public void doWash() {
		System.out.println("Bus - washing is going on!!!!");
	}

	public void doRepair(){
		System.out.println("Bus - repairing is going on!!!!");
	}
}

class Erikshaw extends Vehicle implements Washable,Repairable  {
	public void start() {
		System.out.println("Erikshaw started with button press!!!!");
	}

	public void doWash() {
		System.out.println("Erikshaw - washing is going on!!!!");
	}

	public void doRepair(){
		System.out.println("Erikshaw - repairing is going on!!!!");
	}
}


class Driver {

	void drive() {
		Automobile automobile = new Bus();
		automobile.start();
		automobile.stop();	
	}
}

class CarDriver {

	void drive(Car automobile) {
		//Car automobile = new Car();
		automobile.start();
		automobile.accelerate();
		automobile.accelerate();
		automobile.accelerate();
		automobile.accelerate();
		automobile.applyBrake();	
		automobile.applyBrake();	
		automobile.stop();
	}
}

class Mechanic {
	void repair() {
		Repairable automobile = new Bus();
		automobile.doRepair();
	}
}

class Racer {
	void race() {
		Acceleratable automobile = new Bus();
		automobile.accelerate();
	}
}

class AutomobileTest {
	public static void main(String[] args) {
		//UC1();
		//UC2();
		UC3();
	}

	static void UC3(){
		CarDriver carDriver = new CarDriver();
		carDriver.drive(new Car());
		carDriver.drive(new LuxuryCar());
	}

	static void UC2(){
		Racer racer = new Racer();
		racer.race();
		Mechanic mechanic = new Mechanic();
		mechanic.repair();
	}

	static void UC1(){
		Automobile automobile = new Car();
		automobile.start();
		automobile.stop();
	}
}