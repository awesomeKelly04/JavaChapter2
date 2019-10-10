package Chapter2;

import java.util.Scanner;

public class DigitSpacing {

	private static Scanner value;

	public static void main(String[] args) {
		value = new Scanner(System.in);
		int number;
		
		System.out.println("\nA program to space numbers...");
		System.out.println("***************************");
		
		System.out.print("\nEnter a five (5) digit number: ");
		number = value.nextInt();
		
		if(number/10000 >= 10)
			System.out.println("\nSorry! Your number is more than five digits...");
		if(number/10000 < 1)
			System.out.println("\nSorry! Your number is less than five digits...");
		
		System.out.printf("%d   %d   %d   %d   %d", number/10000, (number/1000)%10, (number/100)%10, (number/10)%10, number%10);
	}
	 
}
