package com.ais.presentation.annotations3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ais.presentation.annotations3.HelloWorld;

public class Principal {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.ais.presentation.annotations3");
		annotationContext.refresh();
		
		HelloWorld helloWorld = (HelloWorld)annotationContext.getBean("helloWorld");
		
		System.out.println(helloWorld.getHello());
		
		annotationContext.close();
		
	}

}
