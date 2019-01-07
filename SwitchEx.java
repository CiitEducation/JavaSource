import java.lang.System;
import java.lang.String;

public class SwitchEx {
public static void main(String args[]) {
	String str="soft";
	switch(str)
	{
	default:
		System.out.println("Default clause is selected");
		break;
	case "software":
		System.out.println("Value software is selected");
		break;
	case "hardware":
		System.out.println("Value hardware is selected");
		break;
	case "firmware":
		System.out.println("Value firmware is selected");
		break;
	
	}	
  }
}