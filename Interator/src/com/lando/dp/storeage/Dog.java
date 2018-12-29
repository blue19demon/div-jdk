package com.lando.dp.storeage;

public class Dog implements Comparable<Dog> {

	private int foot;
	
	@Override
	public String toString() {
		return "Dog [foot=" + foot + "]";
	}

	public Dog() {
		super();
	}

	public Dog(int foot) {
		super();
		this.foot = foot;
	}

	public int getFoot() {
		return foot;
	}

	public void setFoot(int foot) {
		this.foot = foot;
	}

	@Override
	public int compareTo(Dog o) {
		return this.foot-o.getFoot();
	}

}
