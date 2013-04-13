package learn.designpattern.abstractfactory.beverages;

import java.math.BigDecimal;

import learn.designpattern.abstractfactory.abstractentities.Beverage;


public class Coffee extends Beverage {
	public Coffee() {
		this.setName("Coffee");
		this.setPrice(new BigDecimal(10));
	}
}
