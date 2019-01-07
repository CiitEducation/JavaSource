import java.lang.System;
import java.lang.String;
import java.util.Scanner;
import java.lang.Math;

public class AreaTri {
public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
    double a,b,c,base,height,peri,area,s1;
    int k;
    
    System.out.print("Enter either 1 or 2");
    k=s.nextInt();
    
    switch(k)
    {
    case 1:
    	System.out.println("Enter the Value of a");
    	a=s.nextDouble();
    	System.out.println("Enter the value of b");
    	b=s.nextDouble();
    	System.out.println("Enter the value of c");
    	c=s.nextDouble();
    	
    	peri=a+b+c;
    	s1=(a+b+c)/2;
    	area=Math.sqrt((s1*(s1-a)*(s1-b)*(s1-c)));
    	System.out.println("Perimeter is" + peri);
    	System.out.println("Area is" + area);
        break;
    case 2:
    	System.out.println("Enter Base");
    	base=s.nextDouble();
    	System.out.println("Enter Height");
    	height=s.nextDouble();
    	area=(base*height)/2;
    	System.out.println("Area is" + area);
    	break;
    }
    
}
}
