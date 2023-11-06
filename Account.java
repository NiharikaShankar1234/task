package Encapsulation.DataHiding;

public class Account {
	private int  acno;
	private	int ifsccode;
			
	protected String location ;
	protected String address;
	double amount;
 protected void info() {
	 System.out.println("Protected method in other package");
 }
 public int getacno() {
		return acno;
	}
 public int getifsccode() {
		return ifsccode;
	}
	//setter
	public void setacno(int acno) {
		this.acno = acno;
	}
	public void setifsccode(int ifsccode) {
		this.ifsccode = ifsccode;
	}
}
