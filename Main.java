package SingleLevelInheritance;

public class Main {
	public static void main(String[] args)
	{
		// object creation
		Triangle t = new Triangle();
		t.printColor();
		t.area();
		t.color = "Purple";
		System.out.println("Color variable value = "+ t.color );
	}
}
