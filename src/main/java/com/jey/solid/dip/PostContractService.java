/**
 * Jeyaprakash Ganesan jeyaprakash.g@gmail.com
 */
package com.jey.solid.dip;

/**
 * This class sends the contract through EMail
 */
public class PostContractService implements ContractSender {

	@Override
	public void sendContract() {
		System.out.println("Send Contract through Post");

	}

}
