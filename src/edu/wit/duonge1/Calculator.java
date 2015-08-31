package edu.wit.duonge1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String input = "";
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		boolean num = true;
		String op = "";
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("Enter your first number: ");
			try {
				input1 = in.nextDouble();
				num = true;
			} catch (InputMismatchException e) {
				System.out.println("You did not enter a number");
				System.out.println(e.getMessage());
				in.nextLine(); // to consume the non integer character along 
							   // with the new line character which is stays in the buffer
							   // (hence, infinitely printing the catch sysout), in the case where you've given a wrong input.
				num = false;
			}
		} while (!num);
		num = true;
		do {
			System.out.print("Enter your second number: ");
			try {
				input2 = in.nextDouble();
				num = true;
			} catch (InputMismatchException e) {
				System.out.println("You did not enter a number");
				System.out.println(e.getMessage());
				in.nextLine();
				num = false;
			}
		} while (!num);
			System.out.print("Enter your operation choice: ");
			op = in.next();
			
			switch(op) {
				case "+":
					result = input1+input2;
					break;
				case "-":
					result = input1-input2;
					break;
				case "/":
					result = input1/input2;
					break;
				case "*":
					result = input1*input2;
					break;
				default:
					System.out.println("That operation was not a real operation");
					break;
			}
			
			System.out.println("Your answer is: "+String.valueOf(result));

	}

}
