package learn.designpattern.abstractfactory.sandwiches;

import java.math.BigDecimal;

import learn.designpattern.abstractfactory.abstractentities.Sandwich;

public class CheeseSandwich extends Sandwich{
	public CheeseSandwich() {
		this.setName("CheeseSandwich");
		this.setPrice(new BigDecimal(30));
	}
}
