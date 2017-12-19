package com.ais.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ais.presentation.annotations.HelloWorld;

public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext appContent = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		HelloWorld helloWorld = (HelloWorld)appContent.getBean("helloWorld");
		
		System.out.println(helloWorld.getHello());
		
		appContent.close();
		
	}

}
