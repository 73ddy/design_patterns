package learn.designpatterns.abstractfactory.objectfactory;

import learn.designpattern.abstractfactory.abstractentities.Beverage;
import learn.designpattern.abstractfactory.abstractentities.FoodItem;
import learn.designpattern.abstractfactory.beverages.Coffee;
import learn.designpattern.abstractfactory.beverages.Lemonade;
import learn.designpattern.abstractfactory.beverages.Tea;

public class BeverageFactory extends AbstractFoodFactory {
	private final static BeverageFactory instance = new BeverageFactory();

	private BeverageFactory() {
	}

	public static BeverageFactory getInstance() {
		return instance;
	}

	@Override
	protected FoodItem getFoodItem(String foodItemName) {
		Beverage beverage = null;
		if (foodItemName.equalsIgnoreCase("Coffee")) {
			beverage = new Coffee();
		} else if (foodItemName.equalsIgnoreCase("Tea")) {
			beverage = new Tea();
		} else if (foodItemName.equalsIgnoreCase("Lemonade")) {
			beverage = new Lemonade();
		}
		return beverage;
	}

}
