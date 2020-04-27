/**
 * 
 */
package com.limitService.model;

/**
 * @author jyotibikashsahoo
 *
 */
public class Limit {
	
	private int maximumLimit;
	private int minimumLimit;
	
	
	public Limit(int maximumLimit, int minimumLimit) {
		super();
		this.maximumLimit = maximumLimit;
		this.minimumLimit = minimumLimit;
	}
	public int getMaximumLimit() {
		return maximumLimit;
	}
	public void setMaximumLimit(int maximumLimit) {
		this.maximumLimit = maximumLimit;
	}
	public int getMinimumLimit() {
		return minimumLimit;
	}
	public void setMinimumLimit(int minimumLimit) {
		this.minimumLimit = minimumLimit;
	}
	

}
