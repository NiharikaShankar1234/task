package Package2;
import  Encapsulation.DataHiding.Account;
public class BankCustomer extends Account {
public static void main(String []  args) {
	BankCustomer bc = new BankCustomer();
	bc.location = ("Pune");
	bc.address = ("#301, 5th cross Sai layout, RT Nagar");
	bc.info();
	System.out.println("Customer Location: "+bc.location);
	System.out.println("Customer Address: "+bc.address);
}
}
