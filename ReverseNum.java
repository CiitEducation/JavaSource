//program to accept a number and find the reverse of the number
import java.lang.String;
import java.lang.System;

public class ReverseNum {
public static void main(String args[]) {
	int num,rev=0,t;
	num=Integer.parseInt(args[0]);
	t=num;
	while(num>0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println("Reverse of the given number" + rev);
	
	if(rev==t)
		System.out.println("Number is palindrome");
	else
		System.out.println("Not a palindrome");
}
}
