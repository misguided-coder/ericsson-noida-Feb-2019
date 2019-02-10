class Desk extends Furniture {

	String material = "Iron";
	
	@Override
	void paint() {
		System.out.println("Desk is painted using hand brush!!!");
	}

	void info() {
		super.info();
		System.out.printf("MATERIAL : %s%n",this.material);
	}
	
}