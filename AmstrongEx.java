
import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class AmstrongEx {
public static void main(String args[]) {
	int n,sum=0,n1,m;
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a Number");
	n=s.nextInt();
	
	n1=n;
	
	while(n1>0)
	{
		m=n1%10;
		sum=sum+(m*m*m);
		n1=n1/10;
	}
	if(sum==n)
		System.out.println("Amstrong number");
	else
		System.out.println("Not an amstrong number");
}
}
