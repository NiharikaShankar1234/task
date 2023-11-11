package InterfaceColor;

public class Color implements Blue{

	public void red() 
	{
		System.out.println("The colour Choosen is red");
		
	}
	public void blue()
	{
		System.out.println(" The colour Choosen is blue");
		
	}
	public static void main (String []args)
	{
		Color C = new Color();
		C.blue();
		C.red();
	}
}
