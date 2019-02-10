class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.sum(10,2);
		calculator.sum(4,10,2);
		calculator.sum(4,100.60);
		calculator.sum(100.60,6);
	}
}