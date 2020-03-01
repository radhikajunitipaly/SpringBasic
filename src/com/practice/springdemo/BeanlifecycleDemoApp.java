package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanlifecycleDemoApp {

	public static void main(String[] args) {
		//Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
		
		//get bean from the app context
		Coach coach = context.getBean("mycoach", Coach.class);
		
		System.out.println("done!!" + coach.getDailyWorkout());
		//close the context
		context.close();
	}

}
