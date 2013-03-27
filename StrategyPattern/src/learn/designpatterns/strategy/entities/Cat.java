package learn.designpatterns.strategy.entities;

import learn.designpatterns.strategy.abilities.FlyingAbility;

public class Cat extends Animal {

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param weight
	 * @param flyingAbility
	 */
	public Cat(String name, float weight, FlyingAbility flyingAbility) {
		super(name, weight, "meow", flyingAbility);
	}

}
