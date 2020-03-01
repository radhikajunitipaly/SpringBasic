package com.practice.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "It is a wonderful day for you.";
	}

}
