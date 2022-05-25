package com.chris.spring_annotation_project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("pingPongCoach", Coach.class);
		
		// call a method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		
		// call method to get the daily fortune 
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
