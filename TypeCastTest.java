class TypeCastTest {
	public static void main(String[] args) {
		//UC1();
		//UC2();
		UC3();
	}

	static void UC3() {
			
		Furniture furniture1 = new Chair();
		Chair furniture2 = (Chair) furniture1;
		
		//Furniture furniture3 = furniture2; 
		//furniture3.paint();
		
		furniture2.buy();
	}


	//Rules for object types
	static void UC2() {
		//Furniture furniture = new Furniture();
		//System.out.println(furniture);
	
		//Chair chair = new Chair();
		//System.out.println(chair);
	
		//Will never work in Java
		 //Chair chair = (Chair) new Furniture(); 
		
		Furniture furniture1 = new Chair();
		Furniture furniture2 = new Desk();
	}

	//Rules for primitives
	static void UC1() {
		int i = 10;
		System.out.println(i);
		
		long j = i; //implicit typecasting
		System.out.println(j);
		
		long x = 1000L;
		System.out.println(x);

		int y = (int) x; //explicit typecasting
		System.out.println(y);
	}
}