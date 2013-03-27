package learn.designpatterns.strategy.abilities.flying;

import learn.designpatterns.strategy.abilities.FlyingAbility;

public class SparrowLikeFlyingAbility implements FlyingAbility{

	@Override
	public void fly() {
		System.out.println("I fly just like a sparrow.");
	}

}
