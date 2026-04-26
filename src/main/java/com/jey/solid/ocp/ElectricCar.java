/**
 * Jeyaprakash Ganesan jeyaprakash.g@gmail.com
 */
package com.jey.solid.ocp;

/**
 * This class describes the behaviour of accelerate the ElectricCar
 */
public class ElectricCar implements Vehicle {

	@Override
	public void fillFuel() {
		System.out.println("This runs on Battery. So no fuel to be filled");

	}

	@Override
	public void accelerate() {
		System.out.println("Speed is accelerated");

	}

}
