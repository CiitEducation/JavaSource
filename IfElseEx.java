import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class IfElseEx {
public static void main(String args[]) {
	int num;
    Scanner s = new Scanner(System.in);	
    
    System.out.println("Enter the Number");
    num=s.nextInt();
    
    if(num%2==0) {
    	System.out.println("Computing Even number");
    	System.out.println("Even Number");
    }
    else
    	System.out.println("Odd Number");
    
  }
}