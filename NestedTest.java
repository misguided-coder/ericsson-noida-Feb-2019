class HouseOwner {
	
	String name = "Pintu";
	private double electricity = 5.0; //KW

	void info() {
		System.out.printf("House has electricity load of %s KW. %n",this.electricity);	
		System.out.println("Tenant Details =============== ");	
		Tenant tenant = new Tenant();
		tenant.info();
	}
	
	class Tenant {

		String name = "Jaggu";
		int age = 15;
		String location = "Delhi";

		void info() {
			System.out.printf("NAME : %s%n",this.name);
			System.out.printf("AGE : %s%n",this.age);
			System.out.printf("LOCATION : %s%n",this.location);
		}

		void useFacitities() {
			System.out.printf("Tenant is using %s KW electricity load. %n",electricity*.20);	
		}		
	}	
}

class NestedTest {
	public static void main(String[] args) {
		HouseOwner houseOwner = new HouseOwner(); 
		System.out.println(houseOwner.name); 	
		houseOwner.info();
		//System.out.println(houseOwner.electricity); 	//Will not compile	
	
		//HouseOwner.Tenant tenant = houseOwner.new Tenant();
		//tenant.useFacitities();
		//tenant.info();
	}
}