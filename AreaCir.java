import java.lang.String;
import java.lang.System;
import java.lang.Math;

public class AreaCir {
public static void main(String args[]) {
	double radius=Double.parseDouble(args[0]);
    double area=Math.PI*radius*radius;
    System.out.println("Area of a Circle is" + area);
    
 }
}
