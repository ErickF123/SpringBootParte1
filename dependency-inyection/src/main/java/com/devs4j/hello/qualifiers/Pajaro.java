/**
 * 
 */
package com.devs4j.hello.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * 
 */

@Component("pajarito")
public class Pajaro extends Animal implements Volador{
	
	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);
	
	public Pajaro(@Value("Pajaro loco") String nombre, @Value("1") Integer edad) {
		super(nombre, edad);
	
	}
		
	@Override
	public void volar() {
		
		log.info("Soy un pajaro volador");
	}

}
