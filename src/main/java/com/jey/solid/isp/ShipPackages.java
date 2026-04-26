/**
 * Jeyaprakash Ganesan jeyaprakash.g@gmail.com
 */
package com.jey.solid.isp;

/**
 * In a sample E-Commerce application, this class ships the items to
 * the intermediate Logistics Centre
 */
public class ShipPackages implements Shippable {

	@Override
	public void shipItems() {
		System.out.println("Ship items to the customer address");
	}

}
