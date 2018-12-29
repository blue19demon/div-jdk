package com.lando.dp.iterator;

public interface Collection<E> {
	public void add(E o);

	public int size();
	
	public Iterator iterator();
	
}
