package org.testt;

public class Employee {

	public void empDetails(String name) {

		System.out.println("Employee name is:" + name);
	}

	public void empDetails(String name, int id, long phNumber) {
		System.out.println(
				"Employee name is:" + name + "\n employee id is" + id + "\n employee phone number:" + phNumber);

	}

	public void empDetails(float salery) {
		System.out.println("employee salaery is " + salery);

	}

	public void empDetails(String city, int pincode) {

		System.out.println("employee city is:"+city);
		System.out.println("employee pin code is"+pincode);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.empDetails("rusthum");
		
		e.empDetails("rusthum2", 12345, 7418851444l);
		e.empDetails("mumbai", 600042);
		e.empDetails(2548.22255f);
	}
	
}