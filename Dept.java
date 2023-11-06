package Package2;
import Encapsulation.DataHiding.Employee;
public class Dept extends Employee {
		
	public static void main (String[] args) {
			// access protected data
		Dept d1 = new Dept();
		d1.display();
		d1.dptname = "Marketing";
		d1.name = "Suma";
			
		System.out.println("Name of Customer = "+d1.name);
		System.out.println("Email of Customer = "+d1.dptname);
}
}
