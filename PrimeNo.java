public class PrimeNo {
public static void main(String[] args) 
{
	int num = 8, count =0;
	for(int i =1; i<= num; i++)
	{
	if(num% i ==0)
	{
		count++;
	}
}
	if(count==2)
	{
		System.out.println("Number is Prime");
	}
	else {
		System.out.println("Number is not Prime");
	}
}
}