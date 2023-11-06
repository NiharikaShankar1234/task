package Package2;

import Encapsulation.DataHiding.Person;
public class Customer extends Person{
	
	public static void main (String[] args) {
		// access protected data
		Customer c1 = new Customer();
		c1.display();
		c1.email ="abc@gmail.com";
		c1.name = "Uma";
		
		System.out.println("Name of Customer = "+c1.name);
		System.out.println("Email of Customer = "+c1.email);
	}
}
