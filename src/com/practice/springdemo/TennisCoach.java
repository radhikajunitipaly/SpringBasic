package com.practice.springdemo;

public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach(FortuneService fortuneService) {		
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice Tennis for 10 hours minimum everyday!";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
