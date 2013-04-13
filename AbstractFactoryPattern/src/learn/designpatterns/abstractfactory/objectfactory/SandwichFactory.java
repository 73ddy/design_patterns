package learn.designpatterns.abstractfactory.objectfactory;

import learn.designpattern.abstractfactory.abstractentities.FoodItem;
import learn.designpattern.abstractfactory.abstractentities.Sandwich;
import learn.designpattern.abstractfactory.sandwiches.CheeseSandwich;
import learn.designpattern.abstractfactory.sandwiches.GrilledSandwich;
import learn.designpattern.abstractfactory.sandwiches.PeanutButterSandwich;

public final class SandwichFactory extends AbstractFoodFactory {
	private final static SandwichFactory instance = new SandwichFactory();

	private SandwichFactory() {
	}

	public static SandwichFactory getInstance() {
		return instance;
	}

	@Override
	protected FoodItem getFoodItem(String foodItemName) {
		Sandwich beverage = null;
		if (foodItemName.equalsIgnoreCase("CheeseSandwich")) {
			beverage = new CheeseSandwich();
		} else if (foodItemName.equalsIgnoreCase("GrilledSandwich")) {
			beverage = new GrilledSandwich();
		} else if (foodItemName.equalsIgnoreCase("PeanutButterSandwich")) {
			beverage = new PeanutButterSandwich();
		}
		return beverage;
	}

}
