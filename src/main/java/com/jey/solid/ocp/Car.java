/**
 * Jeyaprakash Ganesan jeyaprakash.g@gmail.com
 */
package com.jey.solid.ocp;

/**
 * This class describes the behaviour of filling the fuel and accelerate
 */
public class Car implements Vehicle {

	@Override
	public void fillFuel() {
		System.out.println("Petrol is filled");
	}

	@Override
	public void accelerate() {
		System.out.println("Speed is accelerated");
	}

}
