package learn.designpattern.abstractfactory.sandwiches;

import java.math.BigDecimal;

import learn.designpattern.abstractfactory.abstractentities.Sandwich;

public class GrilledSandwich extends Sandwich {
	public GrilledSandwich() {
		this.setName("GrilledSandwich");
		this.setPrice(new BigDecimal(30));
	}
}
