package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Apple {

	private String name;
	private Integer weight;
	public static boolean fiterGreentApple(Apple apple) {
		return "green".equals(apple.getName());
	}

	public static boolean fiterWeightApple(Apple apple) {
		return apple.getWeight() > 10;
	}
}
