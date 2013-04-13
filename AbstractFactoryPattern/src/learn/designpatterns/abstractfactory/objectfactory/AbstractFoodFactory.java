package learn.designpatterns.abstractfactory.objectfactory;

import learn.designpattern.abstractfactory.abstractentities.FoodItem;

public abstract class AbstractFoodFactory {
	protected abstract FoodItem getFoodItem(String foodItemName);

	public FoodItem orderFoodItem(String foodItemName) {
		return getFoodItem(foodItemName);
	}
}
