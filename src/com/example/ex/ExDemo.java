package com.example.ex;

public class ExDemo {

	public static void main(String[] args) {

		try {

			Integer it = new Integer(120);
			it.intValue();

			int[] arr = new int[10];

			arr[15] = 20000;

			int i = 10;
			int j = 0;
			int rs = i / j;
			System.out.printf("Result : %s%n", rs);
			// 500 loc
		} catch (ArithmeticException exception) {
			System.out.println("ArithmeticException Caught properly!!!");
			System.out.println(exception.getMessage());
			//exception.printStackTrace();
		}/* catch (IndexOutOfBoundsException exception) {
			System.out.println("IndexOutOfBoundsException Caught properly!!!");
			System.out.println(exception.getMessage());
			//exception.printStackTrace();
		}*/ catch (NullPointerException exception) {
			System.out.println("NullPointerException Caught properly!!!");
			System.out.println(exception.getMessage());
			//exception.printStackTrace();
		} catch (Exception exception) {
			System.out.println("Exception Caught properly!!!");
			System.out.println(exception.getMessage());
			//exception.printStackTrace();
		} finally {
			System.out.println("I am the boss!!!!");
		}
	}

}
