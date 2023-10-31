package OOPS_Concept;

public class AdditionMOL {

public void add(int a, int b) {
	int sum = a+b;
	System.out.println(sum);
}
public void add(int a, int b, int c) {
	int sum = a+b+c;
	System.out.println(sum);
}

	public static void main(String [] args)
	{
		AdditionMOL ad = new AdditionMOL();
		ad.add(10,50);
		ad.add(2,5,3);
	}
	}
