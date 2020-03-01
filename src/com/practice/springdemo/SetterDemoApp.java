package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//Load Spring config file
		ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from cofig
		CricketCoach coach = appcontext.getBean("mycricketcoach", CricketCoach.class);
		//call methods of bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		//close config
		appcontext.close();
	}

}
