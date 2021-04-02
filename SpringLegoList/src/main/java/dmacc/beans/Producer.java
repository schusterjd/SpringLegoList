/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Apr 1, 2021
 */
package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Producer {

	private String factory;
	
	public Producer() {
		super();
	}

	public Producer(String factory) {
		super();
		this.factory = factory;
	}

	/**
	 * @return the factory
	 */
	public String getFactory() {
		return factory;
	}

	/**
	 * @param factory the factory to set
	 */
	public void setFactory(String factory) {
		this.factory = factory;
	}

	@Override
	public String toString() {
		return "Producer [factory=" + factory + "]";
	}

}
