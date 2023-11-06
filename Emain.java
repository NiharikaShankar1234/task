package Encapsulation.DataHiding;

public class Emain {

	public static void main(String [] args)
	{
		Employee e1 = new Employee();
		e1.name = "Karan";
		e1.dptname = "Production";
		e1.location = "Bengalore";
		e1.seteid(101);
		e1.geteid();
		
		System.out.println("Employee Name is "+ e1.name);
		System.out.println("Employee Department is "+ e1.dptname);
		System.out.println("Employee Location is "+ e1.location);
		System.out.println("Employee Id is "+ e1.geteid());
	}
}
