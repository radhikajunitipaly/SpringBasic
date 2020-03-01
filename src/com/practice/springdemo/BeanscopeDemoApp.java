package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanscopeDemoApp {

	public static void main(String[] args) {
		//Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		//get bean from the app context
		Coach coach = context.getBean("mycoach", Coach.class);
		Coach coachAlpha = context.getBean("mycoach", Coach.class);
		
		System.out.println(coach==coachAlpha);
		//close the context
		context.close();
	}

}
