class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();	
		employee.name = "Jaggu";
		employee.salary = 340000.00;

		employee.salary = 340.00;

		System.out.println(employee.salary);
	}
}