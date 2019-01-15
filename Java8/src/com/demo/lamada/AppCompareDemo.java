package com.demo.lamada;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.demo.entity.Apple;

public class AppCompareDemo {

	public static void main(String[] args) {
		List<Apple> list = Arrays.asList(new Apple("green", 10), new Apple("red", 19), new Apple("green1", 11),
				new Apple("green3", 9), new Apple("red", 15));
		sork8(list);
		list.stream().forEach(System.out::println);
	
	}
	public static void sork8(List<Apple> list) {
		list.sort((Apple o1, Apple o2)->
			o1.getWeight().compareTo(o2.getWeight())
		);
	}
	public static void sork7(List<Apple> list) {
		Collections.sort(list, new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getWeight()-o2.getWeight();
			}
		});
		for (Apple apple : list) {
			System.out.println(apple);
		}
	}

}
