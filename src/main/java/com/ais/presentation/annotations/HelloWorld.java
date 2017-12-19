package com.ais.presentation.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Repository - Used to mark a bean as DAO Component on persistence layer
 * @Service - Used to mark a bean as Service Component on business layer
 * @RestController - Used to mark a bean as RestController Component on Web Service layer
 * @author davidm
 *
 */

public class HelloWorld {
	
	@Autowired
	@Value("Hello World From Annotations!")
	private String hello;
	
	public HelloWorld() {
		
	}
	
	public HelloWorld(String hello) {
		this.hello = hello;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
}
