package learn.designpattern.abstractfactory.simulator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import learn.designpattern.abstractfactory.abstractentities.FoodItem;
import learn.designpatterns.abstractfactory.objectfactory.AbstractFoodFactory;
import learn.designpatterns.abstractfactory.objectfactory.BeverageFactory;
import learn.designpatterns.abstractfactory.objectfactory.SandwichFactory;

/**
 * Think of a cafe where you get a variety of beverages and sandwiches.
 */
public class Simulator {
	// Using a scanner for taking user input
	private final static Scanner scanner = new Scanner(System.in);

	// The food factory which will be responsible for creating the food items
	private static AbstractFoodFactory foodFactory = null;

	private static Map<Integer, String> menu = null;

	public static void main(String[] args) {
		prepareMenu();
		printMenu();
		supplyBeverage(inputCustomerChoice());
	}

	/**
	 * Takes the customer's input/choice
	 */
	private static int inputCustomerChoice() {
		String choice = null;
		if (scanner.hasNext()) {
			choice = scanner.nextLine();
		}
		isValidChoice(choice);
		return Integer.parseInt(choice);
	}

	/**
	 * Prepare the menu for the customer
	 */
	private static void prepareMenu() {
		menu = new HashMap<Integer, String>();
		menu.put(1, "Coffee");
		menu.put(2, "Tea");
		menu.put(3, "Lemonade");
		menu.put(4, "GrilledSandwich");
		menu.put(5, "PeanutButterSandwich");
		menu.put(6, "CheeseSandwich");
	}

	/**
	 * Uses the beverage factory to create a new beverages
	 * 
	 * @param choice
	 */
	private static void supplyBeverage(int choice) {
		if (choice <= 3) {
			foodFactory = BeverageFactory.getInstance();
		} else {
			foodFactory = SandwichFactory.getInstance();
		}

		FoodItem foodItem = foodFactory.orderFoodItem(menu.get(choice));
		if (foodItem != null) {
			System.out.println("Your food item " + foodItem.getName() + " has been delivered. Please pay "
					+ foodItem.getPrice() + " currency units.");
		}
	}

	/**
	 * Prints the menu of the beverage factory
	 */
	private static void printMenu() {
		System.out.println("What will you like to have?");
		for (Integer item : menu.keySet()) {
			System.out.println("    " + item + ". " + menu.get(item));
		}
	}

	/**
	 * Validates if the a menu choice is a valid choice
	 * 
	 * @param choice
	 *            - menu item chosen
	 */
	private static void isValidChoice(String choice) {
		int intChoice = 0;
		intChoice = Integer.parseInt(choice);
		if (!menu.keySet().contains(intChoice)) {
			throw new IllegalArgumentException();
		}
	}
}
