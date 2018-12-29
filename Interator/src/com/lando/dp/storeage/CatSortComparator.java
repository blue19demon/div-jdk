package com.lando.dp.storeage;

public class CatSortComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		return o2.getWeight()-o1.getWeight();
	}

}
