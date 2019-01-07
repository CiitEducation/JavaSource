import java.lang.System;
import java.lang.String;

public class MultipleIfEx {
public static void main(String args[]) {
	int m1,m2,m3,tot,aveg;
	
    m1=Integer.parseInt(args[0]);
    m2=Integer.parseInt(args[1]);
    m3=Integer.parseInt(args[2]);
    
    tot=m1+m2+m3;
    aveg=tot/3;
    
    if(aveg>=80)
    	System.out.println("Grade is A");
    else if(aveg>=70 && aveg<=79)
    	System.out.println("Grade is B");
    else if(aveg>=60 && aveg<=69)
    	System.out.println("Grade is C");
    else
    	System.out.println("Grade is Fail");
	    }  
}