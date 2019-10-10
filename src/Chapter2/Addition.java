package Chapter2;

import java.util.Scanner;

public class Addition{
	private static Scanner input;

	public static void main (String[] arg){		
		int number1, number2;
		input = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.println("Enter second integer: ");
		number2 = input.nextInt();
		
		SumMul object = new SumMul();
		System.out.printf("The sum of the two numbers is %d%n", object.add(number1, number2));		
	}
}
