class FurnitureTest {
	public static void main(String[] args) {
		//UC1();
		//UC2();
		//UC3();
		//UC4();
		UC5();

	}

	static void UC5 () {
		
		Desk desk = new Desk();
		//System.out.println(desk.id);
		
		System.out.println(desk.material);
		
		desk.info();
		
		desk.paint(); 
	}


	static void UC4 () {
		
		Chair chair = new Chair(2,"Plastic",150.00,2,4);

		System.out.println(chair.id);
		System.out.println(chair.material);
		System.out.println(chair.price);
		System.out.println(chair.hands);
		System.out.println(chair.legs);

		chair.make();
		chair.paint();
		chair.sell();
	}

	static void UC3 () {
		
		Chair chair = new Chair(2,"Plastic",150.00);
		System.out.println(chair.id);
		System.out.println(chair.material);
		System.out.println(chair.price);
	}

	static void UC2 (){
		
		Chair chair = new Chair();
		System.out.println(chair.id);
		System.out.println(chair.material);
		System.out.println(chair.price);
	}

	static void UC1 (){
		
		Furniture furniture = new Furniture();
		furniture.id = 1;

		System.out.println(furniture.id);

		Chair chair = new Chair();
		
		chair.id = 2;
		chair.price = 2000.00;
		
		System.out.println(chair.id);
		System.out.println(chair.material);
		System.out.println(chair.price);

		chair.sell();

		Desk desk = new Desk();
		desk.id = 3;
		desk.price = 5400.00;

		System.out.println(desk.id);

		desk.sell();

	}
}