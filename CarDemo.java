class CarDemo {
	public static void main(String[] args) {
		//UC1();
		//UC2();
		//UC3();
		//UC4();
		UC5();

	}

	static void UC5() {

		Car car1 = new Car(); 
		Car car2 = new Car(1000,"X4","BMW",560000.00,240,"Red"); 
		
		car1.info();
		car2.info();
		
		System.out.println("=======================");
	}




	static void UC4() {

		Car car1 = new Car(); 
		car1.vin = 200;

		Car car2 = new Car(); 
		car2.vin = 300;
		
		car1.info();
		car2.info();
		
		System.out.println("=======================");
	}


	static void UC3() {

		Car car = new Car(); 
		
		car.info();

		car.start();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();

		car.speedDown();
		car.speedDown();

		car.stop();
		
		System.out.println("=======================");
	}


	static void UC2() {

		//new instance/object is created 
		//and assigned to reference valiable
		Car car = new Car(); 
			
		car.vin = 1000;	
		car.model = "Q7";	
		car.make = "Audi";	
		car.price = 80000000; //Rs	
		car.speed = 180; //km per hr
		car.color = "Black";	

		System.out.println(car.vin);
		System.out.println(car.model);
		System.out.println(car.make);
		System.out.println(car.price);
		System.out.println(car.speed);
		System.out.println(car.color);

		car.start();
		car.speedUp();
		car.speedDown();
		car.stop();
		
		System.out.println("=======================");
	}

	static void UC1() {
		Car car = null; //reference variable
		System.out.println(car);
		car = new Car(); //new object is created
		System.out.println(car);
			
		System.out.println(car.vin);
		car.vin = 1000;	
		System.out.println(car.vin);

		System.out.println(car.model);
		car.model = "Q7";	
		System.out.println(car.model);

		car.start();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedDown();
		car.stop();

		System.out.println("=======================");
	}
}