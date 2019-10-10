package Chapter2;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator{
	private static Scanner input;

	public static void main (String[] args){
		double populationSize;
		double growthRate;
		input = new Scanner(System.in);
		
		System.out.println("\nA program to determines World Population Growth\n");
		System.out.print("Enter the current world population: ");
		populationSize = input.nextDouble();
		
		System.out.print("Enter the annual world population growth rate: ");
		growthRate = input.nextDouble();
		
		System.out.printf("In one year, the population will be %.0f%n", ((growthRate/100)*populationSize)+populationSize);
		System.out.printf("In two years, the population will be %.0f%n", (2*(growthRate/100)*populationSize)+populationSize);
		System.out.printf("In three years, the population will be %.0f%n", (3*(growthRate/100)*populationSize)+populationSize);
		System.out.printf("In four years, the population will be %.0f%n", (4*(growthRate/100)*populationSize)+populationSize);
		System.out.printf("In five years, the population will be %.0f%n", (5*(growthRate/100)*populationSize)+populationSize);		
	}
}