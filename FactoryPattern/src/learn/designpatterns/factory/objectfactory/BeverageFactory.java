package learn.designpatterns.factory.objectfactory;

import learn.designpattern.factory.entities.Beverage;
import learn.designpattern.factory.entities.Coffee;
import learn.designpattern.factory.entities.Lemonade;
import learn.designpattern.factory.entities.Tea;

public final class BeverageFactory {
	private final static BeverageFactory instance = new BeverageFactory();

	private BeverageFactory() {
	}

	public static BeverageFactory getInstance() {
		return instance;
	}

	public Beverage makeBeverage(String beverageType) {
		Beverage beverage = null;
		if (beverageType.equalsIgnoreCase("Coffee")) {
			beverage = new Coffee();
		} else if (beverageType.equalsIgnoreCase("Tea")) {
			beverage = new Tea();
		} else if (beverageType.equalsIgnoreCase("Lemonade")) {
			beverage = new Lemonade();
		}
		return beverage;
	}

}
