package learn.designpattern.abstractfactory.beverages;

import java.math.BigDecimal;

import learn.designpattern.abstractfactory.abstractentities.Beverage;


public final class Lemonade extends Beverage {
	public Lemonade() {
		this.setName("Lemonade");
		this.setPrice(new BigDecimal(15));
	}
}
