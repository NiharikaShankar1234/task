
public class PalindromeNo {
public static void main(String[] args)
{
	int num = 3135, rev = 0, rem, anum = num;
	while(num!=0) {
		rem = num%10;
		rev = rev *10 + rem;
		num/=10;
	}
	if(anum == rev ) {
		System.out.println(anum + " is Palindrome");
	}
	else {
		System.out.println(anum + " is not Palindrome");
	}
}
}
