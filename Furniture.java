class Furniture {

	int id;
	String material;
	double price;

	Furniture () {
		System.out.println("Inside Furniture constructor!!!!");
	}

	Furniture (int id,String material,double price) {
		System.out.println("Inside Furniture (int id,String material,double price) constructor!!!!");
		this.id = id;
		this.material = material;
		this.price = price;
	}

	void info() {
		System.out.printf("ID : %s%n",this.id);
		System.out.printf("MATERIAL : %s%n",this.material);
		System.out.printf("PRICE : %s%n",this.price);
	}

	void make() {
		System.out.println("Furniture is made of "+this.material);
	}

	void paint() {
		System.out.println("Furniture is painted!!!");
	}

	void sell() {
		System.out.println("Furniture sold in $"+this.price);
	}
}