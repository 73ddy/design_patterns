package learn.designpatterns.strategy.abilities.flying;

import learn.designpatterns.strategy.abilities.FlyingAbility;

public class NoFlyingAbilty implements FlyingAbility {

	@Override
	public void fly() {
		System.out.println("Sry. I cannot fly. :-(");
	}

}
