package Encapsulation.DataHiding;

public class Person {
 // eg of encapsulation
	// data members
	
	public String name;  // antwhere
	private String password;   //within a class
	protected String email;  // with package and outside package with child class
	int age; //default
	
	//to access private members we use getter setter mtd
	//getter mtd
	public String getPassword() {
		return password;
	}
	
	//setter
	public void setPassword(String password) {
		this.password = password;
	}
	
	protected void display()
	{
		System.out.println("inside protected mtd");
	}
}
