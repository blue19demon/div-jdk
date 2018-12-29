package com.lando.dp.iterator;

import java.util.Arrays;

public class ArrayList<E> implements Collection<E>{

	@SuppressWarnings("unchecked")
	E[] src = (E[])new Object[10];
	int index = 0;

	@Override
	public void add(E o) {
		if(index==src.length) {
			E[] desc = Arrays.copyOf(src, (index * 2) + 1);
			src=desc;
		}
		src[index]=o;
		index++;
	}
	@Override
	public int size() {
		return index;
	}
	
	@Override
	public Iterator iterator() {
		return new Iterator() {
			int  at=0;
			@Override
			public Object next() {
				int oldAt=at;
				if(at<=index) {
					at++;
					return src[oldAt];
				}
				return null;
			}
			
			@Override
			public boolean hasNext() {
				return at<index;
			}
		};
	}
}
