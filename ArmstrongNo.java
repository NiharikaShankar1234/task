
public class ArmstrongNo {
public static void main(String[] args) {
	int n = 295, anum, rem, rev =0;
	anum = n;
	while(anum!=0)
	{
		rem = anum % 10;
		rev += Math.pow(rem, 3);
		anum /= 10;
	}
	if(rev == n)
		System.out.println(n+ " is Armstrong Number");
	else
		System.out.println(n + " is not Armstrong Number");
}
}
