class SwitchDemo {
	public static void main(String[] args) {
		useCase1();
		System.out.println("=======================");
		useCase2();
		System.out.println("=======================");
	}

	//Java 7 additional feature - allows string comparasion
	static void useCase2() {

		String color = "Red";
		
		switch(color) {
			case "Blue":
			       System.out.println("Blue is cool color.");
			       break;
			case "Black":
		  	       System.out.println("Black is a dashing color.");
			       break;
			case "Red":
		  	       System.out.println("Red is a nice color too.");
			       break;
			case "Green":
		  	       System.out.println("Always green.");
			       break;
			default:
		  	       System.out.println("Sea is big");
		}
		
	}


	static void useCase1() {

		int age = 50;
		
		switch(age) {
			case 10:
			       //10 loc
		  	       System.out.println("You are too young.");
			       break;
			case 20:
		  	       System.out.println("You are young.");
			       break;
			case 30:
		  	       System.out.println("You are grown.");
			       break;
			case 60:
		  	       System.out.println("You are old.");
			       break;
			default:
		  	       System.out.println("You are just born.");
		}
		
		
	}

}