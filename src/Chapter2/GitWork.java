package Chapter2;

import java.util.Scanner;
public class GitWork{
	private static Scanner input;

	public static void main(String[] args){
		int num1, num2, reminder = 0;
		input = new Scanner(System.in);
		
		System.out.println("A program to calculate the reminder of two (2) integers");
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		
		reminder = num1 % num2;
		
		System.out.printf("The reminder is %d%n", reminder);	
	}
}