package com.demo.lamada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSONObject;
import com.demo.entity.Apple;

public class AppMapDemo {

	public static void main(String[] args) {
		List<Apple> list = Arrays.asList(new Apple("green", 10), new Apple("red", 15), new Apple("green1", 10),
				new Apple("green3", 10), new Apple("red", 15));
		Map<Integer, List<Apple>> map=groupAppleJKD8(list);
		System.out.println(JSONObject.toJSON(map));
	}
	public static Map<Integer, List<Apple>> groupAppleJKD8(List<Apple> src) {
		return src.stream().collect(Collectors.groupingBy(Apple::getWeight));
	}
	public static Map<Integer, List<Apple>> groupAppleJKD7(List<Apple> src) {
		Map<Integer, List<Apple>> map = new LinkedHashMap<>();
		for (Apple apple : src) {
			if (map.containsKey(apple.getWeight())) {
				map.get(apple.getWeight()).add(apple);
			} else {
				ArrayList<Apple> list=new ArrayList<>();
				list.add(apple);
				map.put(apple.getWeight(), list);
			}
		}
		return map;
	}

}
