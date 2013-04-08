package learn.designpattern.factory.simulator;

import java.util.Scanner;

import learn.designpattern.factory.entities.Beverage;
import learn.designpatterns.factory.objectfactory.BeverageFactory;

/*
 * Think of a cafe where you get a variety of beverages. Customers will have to supplied with beverage of their choice.
 * As the customer asks for a beverage, you have to generate a new beverage.
 * 
 */
public class Simulator {
	// Using a scanner for taking user input
	private final static Scanner scanner = new Scanner(System.in);
	// The name of beverage customer asked for
	private static String beverageChoice = null;
	// The new beverage created by the BeverageFactory
	private static Beverage beverage = null;

	public static void main(String[] args) {
		printMenu();
		inputCustomerChoice();
		supplyBeverage();
	}

	
	/**
	 * Takes the customer's input/choice
	 */
	private static void inputCustomerChoice() {
		if (scanner.hasNext()) {
			beverageChoice = scanner.nextLine();
		}
	}

	/**
	 * Uses the beverage factory to create a new beverages
	 */
	private static void supplyBeverage() {
		beverage = BeverageFactory.getInstance().makeBeverage(beverageChoice);

		if (beverage == null) {
			System.out.println("Invalid beverage name suppplied.");
		} else {
			System.out.println(beverage.getName() + " will cost you Rs. " + beverage.getPrice());
		}
	}

	/**
	 * Prints the menu of the beverage factory
	 */
	private static void printMenu() {
		System.out.println("What will you like to have?");
		System.out.println("    1. Coffee");
		System.out.println("    2. Tea");
		System.out.println("    3. Lemonade");
	}
}
