package com.example.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring{
	public static void main(String [] args){
		//1. Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		//2. Configure the things that we want to manage
		//HelloWorldConfig is my config file
		//Created @Bean - name

		//3. Retriving Beans managed by Spring
		System.out.println(context.getBean("name"));
	}
}
