package activity21_9_2021;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activity21_5_1 {
	public static void main (String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("InputMismatchException");
	System.out.println("Enter the number:");
	try {
		s.nextInt();
		System.out.println("Entered Correctly");
	}
	catch(InputMismatchException e)
	{
		System.out.println("There is mismatch in input");
	}
	try {
		String str = "Hello how are you";
	    System.out.println(str.charAt(14));
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("StringIndexOutOfBoundsException occured");
	}
	}

}
