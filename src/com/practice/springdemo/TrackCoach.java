package com.practice.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		System.out.println("creating Trackcoach bean");
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice every day trackcoach for 25 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	//add init and destroy methods
	
	public void trackCoachInit() {
		System.out.println("Being Initialized");
	}
	
	public void trackCoachDestroy() {
		System.out.println("Being Destroyed");
	}
}
