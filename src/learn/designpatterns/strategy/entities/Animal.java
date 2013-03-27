package learn.designpatterns.strategy.entities;

import learn.designpatterns.strategy.abilities.FlyingAbility;

public abstract class Animal {
	private String name;
	private float weight;
	private String speech;
	/*
	 * This is a behaviour, which can be changed on the fly as per the flying
	 * strategy.
	 */
	private FlyingAbility flyingAbility;

	Animal(String name, float weight, String speech, FlyingAbility flyingAbility) {
		this.name = name;
		this.weight = weight;
		this.speech = speech;
		this.flyingAbility = flyingAbility;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getSpeech() {
		return speech;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}

	public FlyingAbility getFlyingAbility() {
		return flyingAbility;
	}

	public void changeFlyingAbility(FlyingAbility flyingAbility) {
		this.flyingAbility = flyingAbility;
	}
}
