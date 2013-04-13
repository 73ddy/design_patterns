package learn.designpattern.abstractfactory.sandwiches;

import java.math.BigDecimal;

import learn.designpattern.abstractfactory.abstractentities.Sandwich;

public final class PeanutButterSandwich extends Sandwich{
	public PeanutButterSandwich() {
		this.setName("PeanutButterSandwich");
		this.setPrice(new BigDecimal(30));
	}
}
