package activity21_9_2021;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activity21_7 {
	public static void main(String[] args) {
		int num=0;
		String name=null;
		boolean success=false;
		try{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=scan.nextInt();
			num=number;
			scan.nextLine();
			System.out.println("Enter your name");
			String name_changed=scan.nextLine();
			name=name_changed;
			System.out.println("the data you entered is "+name+" ,"+num);
			success=true;
				
		}
		catch(InputMismatchException e) {
			System.out.println("There is error in input");
			
		}
		finally {
			System.out.println("Your session was completed");
			if(success==false) {
				System.out.println("the data is "+name+" ,"+num);
				System.out.println("the data is resetted");
			}
			
			
		}
	}

}
