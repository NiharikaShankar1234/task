
/*public class Vote {
public static void main (String[] args)
{
	int age = 17;
    if(age>=16 && age<=18)
    {
       System.out.println("He/She is Eligible for voting"); 
    }
    else if(age<=15)
    {
        System.out.println("He/She is Not eligible for voting");
    }
    else if(age>=18)
    {
        System.out.println("He/She is Not eligible for voting");
    }
}
}*/


import java.util.Scanner;

public class Vote {
    public static void main(String[] args)
    {System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
       int  age = sc.nextInt();
       if (age>= 16 && age<=18) 
       {
        System.out.println("Eligible for Voting");
       }
       else if(age<= 15)
       {
        System.out.println("not Eligible");
       }else if(age>= 18)
       {
        System.out.println("not eligible");

       }

    }
}