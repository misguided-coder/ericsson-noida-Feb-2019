class Person {

	String name;
	
	void walk(){
		System.out.println("Walking.....");
	}
}

class Student extends Person {
	
	void walk(){
		System.out.println("Student Walking.....");
	}

	void study(){
		System.out.println("Studying.....");
	}		
}

class Athlete extends Person {
	
	void walk(){
		System.out.println("Athlete Walking.....");
	}

	void jump(){
		System.out.println("Jumping.....");
	}		
}


class Trainer {

	void train(Person person) {
		System.out.println("Trainer is giving training -----");
		person.walk();
		if(person instanceof Student){
			Student student = (Student) person;
			student.study();		
		}
		if(person instanceof Athlete){
			Athlete  athlete  = (Athlete) person;
			athlete.jump();
		}
	}	

}



class PersonTest {
	public static void main(String[] args) {
	
		//UC1();
		UC2(); 
	}

	static void UC2() {
		Trainer trainer = new Trainer();	
		trainer.train(new Person());
		trainer.train(new Student());
		trainer.train(new Athlete());
	}

	static void UC1() {
		Person  person = new Student();	
		person.walk();
		//person.study();
				
		Student student = (Student) person;
		student.walk();	
		student.study();	
	}
}