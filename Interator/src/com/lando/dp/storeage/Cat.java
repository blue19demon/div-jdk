package com.lando.dp.storeage;

public class Cat implements Comparable<Cat>{

	private int heigth;
	
	private int weight;

	private Comparator<Cat> comparator=new CatSortComparator();
	
	
	public Comparator<Cat> getComparator() {
		return comparator;
	}

	public void setComparator(Comparator<Cat> comparator) {
		this.comparator = comparator;
	}

	public Cat() {
		super();
	}

	public Cat(int heigth, int weight) {
		super();
		this.heigth = heigth;
		this.weight = weight;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Cat [heigth=" + heigth + ", weight=" + weight + "]";
	}

	@Override
	public int compareTo(Cat o) {
		return comparator.compare(this, o);
	}
	
}
