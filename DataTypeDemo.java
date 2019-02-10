/* Java program to demonstrate different data types 
available and what data they can hold.
*/
class DataTypeDemo {
	public static void main(String[] args) {
		
		//1 byte = 8 bits only
		byte age = 24;
		System.out.println(age);	

		//2 bytes = 16 bits only
		short year = 1980; 
		System.out.println(year);	

		//4 bytes = 32 bits only
		int time = 179012;
		System.out.println(time);
	
		//8 bytes = 64 bits only
		long salary = 12000000;
		System.out.println(salary);
		
		//4 bytes = 32 bits only
		float amount = 8912000.60F;
		System.out.println(amount);
		
		//8 bytes = 64 bits only
		double balance = 998912000.5700;
		System.out.println(balance);

		//2 bytes = 16 bits only
		char letter = 'T';
		System.out.println(letter);

		//1 bit only
		boolean sportsCar = true;
		System.out.println(sportsCar);



	}
}