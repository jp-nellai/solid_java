/**
 * Jeyaprakash Ganesan jeyaprakash.g@gmail.com
 */
package com.jey.solid.isp;

/**
 * In a sample E-Commerce application, this class collects the items from sellers
 * for delivery to Customer
 */
public class CollectPackages implements Collectable {

	@Override
	public void collectItems() {
		System.out.println("Collect the Items from seller");

	}

}
