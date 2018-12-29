package com.lando.dp.storeage;

public class DataSorter {

	public static void sort(Comparable[] data) {
		for (int i = data.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				Comparable a=data[j];
				Comparable b=data[j+1];
				if (a.compareTo(b)>0) {
					swap(data, j, j + 1);
				}
			}
		}
	}

	private static void swap(Comparable[] data, int x, int y) {
		Comparable temp = data[x];
		data[x] = data[y];
		data[y] = temp;
	}

	public static void print(Comparable[] data) {
		for (Comparable comparable : data) {
			System.out.println(comparable);
		}
	}

}
