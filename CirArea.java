import java.lang.System;
import java.lang.String;
import java.util.Scanner;
import java.lang.Math;

public class CirArea {
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
double radius,area;
System.out.println("Enter the Radius");
radius=s.nextDouble();
area=Math.PI*radius*radius;
System.out.println("Area of circle is" + area);
 }
}