package activity21_9_2021;

import java.util.Scanner;

public class activity21_5{
	   int age;
	   String name;
	   public activity21_5(String name, int age){
	      this.age = age;
	      this.name = name;
	   }
	   public void display() {
	      System.out.println("Name of the student is: "+name);
	      System.out.println("Age of the student is: "+age);
	   }
	   public static void main (String args[]){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your name: ");
	      String name = sc.next();
	      System.out.println("Enter your age: ");
	      int age = sc.nextInt();
	      activity21_5 obj = new activity21_5(name, age);
	      obj.display();
	      
	      String str = "Hello how are you";
	      
	      System.out.println(str.charAt(5));
	   }
	}
