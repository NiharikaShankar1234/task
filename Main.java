package Encapsulation.DataHiding;

public class Main {

	public static void main(String [] args)
	{
		// object
		Person p1 = new Person();
		p1.name = "Janu";
		p1.age = 28;
		p1.email = "abc@gmail.com";
		// set value for private data
		
		p1.setPassword("abc1234");
	p1.getPassword();
	
	System.out.println("Name of Person= " +p1.name);
	System.out.println("Email of Person= "+p1.email);
	System.out.println("Age of Person= "+p1.age);
	System.out.println("Password of Person = "+p1.getPassword());
	}
}
