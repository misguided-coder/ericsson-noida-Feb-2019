abstract class Shape {
	
	String size = "10x6"; 
	int border; //in pixels

	Shape (){
		System.out.println("Inside Shape()!!!!");
	}

	Shape (int border) {
		System.out.println("Inside Shape (int border)!!!!");
		this.border = border;
	}

	void info() {
		System.out.printf("SIZE : %s%n",this.size);
	}

	abstract void draw();
	abstract void paint();
}

class Circle extends Shape {
		
	String color;

	Circle () {
		super(2);
		System.out.println("Inside Circle()!!!!");
	}
	
	Circle (String color) {
		super(2);
		System.out.println("Inside Circle (String color)!!!!");
		this.color = color;
	}
	

	@Override
	void draw() {
		System.out.printf("Circle is ready and border width is %s pixels. %n",this.border);
	}

	@Override
	void paint() {
		System.out.printf("Circle is painted with %s color. %n",this.color);
	}
}

class ShapeTest {
	public static void main(String[] args) {
		Circle circle = new Circle("Yellow");
		circle.draw();
		circle.paint();

		Shape shape = new Circle();
		shape.draw();
		shape.paint();	
	}
}