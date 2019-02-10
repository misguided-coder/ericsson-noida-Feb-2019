/* Java program to demonstrate use of arrays to hold 
   multiple values together
*/
class ArrayDemo {
	public static void main(String[] args) {
		useCase1();
		System.out.println("=======================");
		useCase2();
		System.out.println("=======================");
		useCase3();
		System.out.println("=======================");
		useCase4();
		System.out.println("=======================");
		useCase5();
		System.out.println("=======================");
		useCase6();
		System.out.println("=======================");
		useCase7();
	}

	//char array usage
	static void useCase7() {

		char[] name = {'R','i','t','e','s','h'};

		System.out.println("Name Length : "+name.length);
		System.out.println(name);
	}


	//2D array usage
	static void useCase6() {

		int[][] scores = new int[4][6];

		//Fill loop
		for(int rowIdx=0;rowIdx<scores.length;rowIdx++) {
			for(int colIdx=0;colIdx<scores[rowIdx].length;colIdx++) {
				scores[rowIdx][colIdx] = 4000;				
			}
		}

		System.out.println("Length : "+scores.length);
		
		System.out.println("Value : "+scores[0][0]);
		System.out.println("Value : "+scores[3][0]);
	}


	//Filling up array using loop
	static void useCase5() {

		//array declaration & initialization
		double[] employeeSalaries = new double[100];
		
		//Fill loop
		for(int idx=0;idx<employeeSalaries.length;idx=idx+1) {
			employeeSalaries[idx] = 5000.00+idx;
		}

		System.out.println(employeeSalaries);

		System.out.println("Length : "+employeeSalaries.length);

		//Display loop
		for(int idx=0;idx<employeeSalaries.length;idx=idx+1) {
			System.out.println("Index : "+idx+" Value : "+employeeSalaries[idx]);
		}
	
	}


	//Displaying array all values
	static void useCase4() {

		//array declaration & initialization & population
		//double[] employeeSalaries = new double[]{100.00,300.00,400.00,2300.00,456.00};
		double[] employeeSalaries = {100.00,300.00,400.00,2300.00,456.00};

		System.out.println(employeeSalaries);

		System.out.println("Length : "+employeeSalaries.length);

		for(int idx=0;idx<5;idx=idx+1) {
			//System.out.println(employeeSalaries[idx]);
			//System.out.println("Index : "+idx);
			//System.out.println("Value : "+employeeSalaries[idx]);

			System.out.println("Index : "+idx+" Value : "+employeeSalaries[idx]);
		}
	
	}



	static void useCase3() {

		//array declaration & initialization & population
		//double[] employeeSalaries = new double[]{100.00,300.00,400.00,2300.00,456.00};
		double[] employeeSalaries = {100.00,300.00,400.00,2300.00,456.00};

		System.out.println(employeeSalaries);

		System.out.println("Length : "+employeeSalaries.length);

		System.out.println(employeeSalaries[0]);
		System.out.println(employeeSalaries[2]);
		System.out.println(employeeSalaries[4]);
	
	}


	static void useCase2() {

		//array declaration & initialization
		double[] employeeSalaries = new double[10];		

		//array population
		employeeSalaries[0] = 1200.00;		
		employeeSalaries[1] = 1500.00;		
		employeeSalaries[2] = 1800.00;		
		employeeSalaries[3] = 1300.00;		
		employeeSalaries[4] = 1100.00;		
		employeeSalaries[5] = 1900.00;		
		employeeSalaries[6] = 1500.00;		
		employeeSalaries[7] = 1200.00;		
		employeeSalaries[8] = 1000.00;		
		employeeSalaries[9] = 1700.00;		

		System.out.println(employeeSalaries);

		System.out.println("Length : "+employeeSalaries.length);

		System.out.println(employeeSalaries[0]);
		System.out.println(employeeSalaries[4]);
		System.out.println(employeeSalaries[9]);
	
	}


	static void useCase1() {

		//array declaration
		double[] employeeSalaries = null;

		//array initialization
		employeeSalaries = new double[10];		

		//array population
		employeeSalaries[0] = 1200.00;		
		employeeSalaries[1] = 1500.00;		
		employeeSalaries[2] = 1800.00;		
		employeeSalaries[3] = 1300.00;		
		employeeSalaries[4] = 1100.00;		
		employeeSalaries[5] = 1900.00;		
		employeeSalaries[6] = 1500.00;		
		employeeSalaries[7] = 1200.00;		
		employeeSalaries[8] = 1000.00;		
		employeeSalaries[9] = 1700.00;		

		System.out.println(employeeSalaries);

		System.out.println("Length : "+employeeSalaries.length);
	
		System.out.println(employeeSalaries[0]);
		System.out.println(employeeSalaries[4]);
		System.out.println(employeeSalaries[9]);

		double salary = employeeSalaries[4];
		System.out.println(salary);

	}

}