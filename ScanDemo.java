import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class ScanDemo {
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
    int num1,num2,result;
    
    System.out.println("Enter the first number");
    num1=s.nextInt();
    System.out.println("Enter the Second number");
    num2=s.nextInt();
    
    result=num1+num2;
    System.out.println("The Result is" + result);
	
 }
}
