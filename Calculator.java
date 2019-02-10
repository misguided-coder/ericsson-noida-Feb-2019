class Calculator {

	void sum(int arg1,int arg2) {
		System.out.println("Inside sum(int arg1,int arg2)!!!!");
		System.out.println(arg1+arg2);
	}

	void sum(int arg1,int arg2,int arg3) {
		System.out.println("Inside sum(int arg1,int arg2,int arg3)!!!!");
		System.out.println(arg1+arg2+arg3);
	}

	void sum(int arg1,double arg2) {
		System.out.println("Inside sum(int arg1,double arg2)!!!!");
		System.out.println(arg1+arg2);
	}

	void sum(double arg2,int arg1) {
		System.out.println("Inside sum(double arg2,int arg1)!!!!");
		System.out.println(arg1+arg2);
	}

	void sum(int arg1,long arg2) {
		System.out.println("Inside sum(int arg1,long arg2)!!!!");
		System.out.println(arg1+arg2);
	}
	
}