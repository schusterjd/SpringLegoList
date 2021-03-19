/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.LegoSets;

@Configuration
public class BeanConfiguration {

	@Bean
	public LegoSets set() {
		
		LegoSets bean = new LegoSets("Sentry", "2008", 500, "EXO-Force");
		return bean;
		
	}

}
