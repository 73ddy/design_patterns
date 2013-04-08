package learn.designpattern.factory.entities;

import java.math.BigDecimal;

public class Lemonade extends Beverage {
	public Lemonade() {
		this.setName("Lemonade");
		this.setPrice(new BigDecimal(15));
	}
}
