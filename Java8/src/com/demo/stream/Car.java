package com.demo.stream;

public class Car implements Vehicle, FourWheeler {
	public static void main(String args[]) {
		Vehicle vehicle = new Car();
		vehicle.print();
	}

	public void print() {
		Vehicle.super.print();
	}
}