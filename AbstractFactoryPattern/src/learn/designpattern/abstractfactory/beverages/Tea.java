package learn.designpattern.abstractfactory.beverages;

import java.math.BigDecimal;

import learn.designpattern.abstractfactory.abstractentities.Beverage;


public final class Tea extends Beverage {
	public Tea() {
		this.setName("Coffee");
		this.setPrice(new BigDecimal(15));
	}
}
