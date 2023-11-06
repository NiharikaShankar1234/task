package Encapsulation.DataHiding;

public class Employee {

	public String name;  // anywhere
	private int eid;   //within a class
	protected String dptname;  // with package and outside package with child class
	String location; //default
	
	public int geteid() {
		
		return eid;
	}
	
	public void seteid(int eid) {
		this.eid = eid;
	}
	protected void display()
	{
		System.out.println("inside protected mtd");
	}
}
