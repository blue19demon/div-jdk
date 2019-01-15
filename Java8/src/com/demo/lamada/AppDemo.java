package com.demo.lamada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.demo.entity.Apple;

public class AppDemo {

	public static void main(String[] args) {
		List<Apple> list=Arrays.asList(new Apple("green", 10), new Apple("red", 15));
		fiterApple(list, (Apple apple) -> apple.getWeight() > 10)
				.stream().forEach(System.out::println);
		fiterApple(list, (Apple apple) -> "green".equals(apple.getName()))
		.stream().forEach(System.out::println);
	}

	public static void jdk8() {
		fiterApple(Arrays.asList(new Apple("green", 10), new Apple("red", 15)), Apple::fiterWeightApple).stream()
				.forEach(System.out::println);
	}

	public static List<Apple> fiterApple(List<Apple> src, Predicate<Apple> p) {
		List<Apple> res = new ArrayList<>();
		for (Apple apple : src) {
			if (p.test(apple)) {
				res.add(apple);
			}
		}
		return res;
	}

	public static void jdk7() {
		List<Apple> res = fiterWeightApple(Arrays.asList(new Apple("green", 10), new Apple("red", 15)));
		for (Apple apple : res) {
			System.out.println(apple);
		}
	}

	public static List<Apple> fiterGreentApple(List<Apple> src) {
		List<Apple> res = new ArrayList<>();
		for (Apple apple : src) {
			if ("green".equals(apple.getName())) {
				res.add(apple);
			}
		}
		return res;
	}

	public static List<Apple> fiterWeightApple(List<Apple> src) {
		List<Apple> res = new ArrayList<>();
		for (Apple apple : src) {
			if (apple.getWeight() > 10) {
				res.add(apple);
			}
		}
		return res;
	}
}
