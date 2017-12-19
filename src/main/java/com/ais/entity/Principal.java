package com.ais.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student estudiante = (Student)context.getBean("student");
		
		System.out.println(estudiante.getIdStudent());
		System.out.println(estudiante.getName());
		System.out.println(estudiante.getSurname());
		System.out.println(estudiante.getAge());
		System.out.println(estudiante.getAddress().toString());
		System.out.println("-----------------------");
		
		Address direccionEstudiante = estudiante.getAddress();
		
		System.out.println(direccionEstudiante.getIdAddress());
		System.out.println(direccionEstudiante.getStreet());
		
		context.close();
		
	}

}
