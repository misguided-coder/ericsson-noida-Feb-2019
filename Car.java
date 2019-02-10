class Car {

	int vin;
	String model;
	String make;
	double price;
	int speed;
	String color;

	Car() {
		this(100,"XE","Jaguar",900000.00,300,"Yellow");
		System.out.println("Inside Car constructor!!");
		/*this.vin = 100;
		this.model = "XE";
		this.make = "Jaguar";
		this.price = 900000.00;
		this.speed = 300;
		this.color = "Yellow";*/
	}

	Car(int vin,String model,String make,double price,int speed,String color) {
		System.out.println("Inside Car(int vin,String model,String make,double price,int speed,String color) constructor!!");
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	
	void info() {
		System.out.println("Car Details : ");
		System.out.println("VIN : "+this.vin);
		System.out.println("MODEL : "+this.model);
		System.out.println("MAKE : "+this.make);
		System.out.println("PRICE : "+this.price);
		System.out.println("SPEED : "+this.speed);
		System.out.println("COLOR : "+this.color);
	}

	void start() {
		System.out.println("Car started!!");
	}

	void speedUp() {
		this.speed = this.speed + 10;
		System.out.println("Car is speeding up and now running at the speed of "+this.speed+" km per hr!!!!");
	}

	void speedDown() {
		this.speed = this.speed - 10;
		System.out.println("Car is speeding down and now running at the speed of "+this.speed+" km per hr!!!!");
	}

	void stop() {
		System.out.println("Car stopped!!");
	}
	
}