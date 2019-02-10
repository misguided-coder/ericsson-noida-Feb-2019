class Chair extends Furniture {
	
	int legs;
	int hands;
	
	Chair () {
		super(1,"Wood",1200.00);
		System.out.println("Inside Chair constructor!!!!");
	}

	Chair (int id,String material,double price) {
		super(id,material,price);
		System.out.println("Inside Chair (int id,String material,double price) constructor!!!!");
	}

	Chair (int id,String material,double price,int legs,int hands) {
		super(id,material,price);
		this.hands = hands;
		this.legs = legs;
		System.out.println("Inside Chair (int id,String material,double price,int legs,int hands) constructor!!!!");
	}

	void paint() {
		System.out.println("Chair painted!!");
	}

	void buy() {
		System.out.println("Chair purchased!!");
	}
	
}