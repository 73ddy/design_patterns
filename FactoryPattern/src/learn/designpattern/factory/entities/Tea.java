package learn.designpattern.factory.entities;

import java.math.BigDecimal;

public class Tea extends Beverage {
	public Tea() {
		this.setName("Coffee");
		this.setPrice(new BigDecimal(15));
	}
}
