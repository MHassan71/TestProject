package userInput;

import java.util.Scanner;

public class InputDemo {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		/*int number;  // User input for integer
		
		System.out.print("Enter any number: ");
		
		number = input.nextInt();
		
		System.out.println("Number = "+ number);*/
		
		/*String name;  // User input for String
		
		System.out.print("Enter your name :");
		name= input.nextLine();   // input.nextLine will print whole strings.
		
		System.out.println("Welcome : " +  name);*/
		
		double num1;
		System.out.print("Enter any double value: ");
		
		num1 = input.nextDouble();  // input for decimal value
		
		System.out.println("Here is your double value: " +num1);
		
	}

}
