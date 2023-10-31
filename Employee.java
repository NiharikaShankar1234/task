package OOPS_Concept;

public class Employee {
	int salary;
	int age;
	
	Employee(int salary, int age)
	{
		this.salary = salary;
		this.age = age;
	}
	public void name() {
		System.out.println("I am Niharika Shankar");
	}
	public int getSalary() {
		return salary;
	}
	public int getage() {
		return age;
	}
	public void dept() {
		System.out.println("I am working in Developer dpt" );
	}
}
