import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class FactoEx {
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int fact,num,k;
	
	System.out.println("Enter any number");
	num=s.nextInt();
	
	for(k=2,fact=1;k<=num;) {
		fact=fact*k;
		k++;
	}
	System.out.println("Factorial of the number is" + fact);
	 }
}