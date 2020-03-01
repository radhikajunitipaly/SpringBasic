package com.practice.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Everyday 30 minute practice of batting for baseball!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
