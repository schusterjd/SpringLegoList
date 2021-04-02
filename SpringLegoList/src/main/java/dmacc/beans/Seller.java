/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Apr 1, 2021
 */
package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Seller {

	private String salesman;
	
	public Seller() {
		super();
	}

	public Seller(String salesman) {
		super();
		this.salesman = salesman;
	}

	/**
	 * @return the salesman
	 */
	public String getSalesman() {
		return salesman;
	}

	/**
	 * @param salesman the salesman to set
	 */
	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}

	@Override
	public String toString() {
		return "Seller [salesman=" + salesman + "]";
	}

}
