package learn.designpattern.factory.entities;

import java.math.BigDecimal;

public final class Coffee extends Beverage {
	public Coffee() {
		this.setName("Coffee");
		this.setPrice(new BigDecimal(10));
	}
}
