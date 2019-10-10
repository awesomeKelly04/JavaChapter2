package Chapter2;

import java.util.Scanner; 

public class ComparisonExample{
	private static Scanner input;

	public static void main(String[] args){
		input = new Scanner(System.in);
		int number1;
		int number2;

		System.out.print("Enter first integer: "); 
		number1 = input.nextInt(); 

		System.out.print("Enter second integer: ");
		number2 = input.nextInt(); 
  
		if (number1 == number2)                             
			System.out.println("\n\"Numbers are equal\"");
       
		if (number1 != number2) 
			System.out.println("\n\"Numbers are not equal\"");  
	} 
}