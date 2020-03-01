package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext appcontext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach coach = appcontext.getBean("mycoach", Coach.class);
		//call methods on bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		//close the context
		appcontext.close();
	}

}
