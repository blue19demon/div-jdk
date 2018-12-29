package com.lando.dp.storeage;

public class TestCase {

	public static void main(String[] args) {
		test01();
	}

	public static void test02() {
		Dog[] data = new Dog[] { new Dog(2), new Dog(1), new Dog(4) };
		DataSorter.sort(data);
		DataSorter.print(data);
	}

	public static void test01() {
		Cat[] data = new Cat[] { new Cat(2, 2), new Cat(1, 1), new Cat(4, 4), new Cat(3, 3) };
		DataSorter.sort(data);
		DataSorter.print(data);
	}

}
