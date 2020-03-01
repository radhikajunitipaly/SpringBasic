package com.practice.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class RandomFortuneService implements FortuneService {

	private List<String> list = new ArrayList<String>();

	
	public RandomFortuneService() {
		super();
		System.out.println("Creating random fortune bean");
		list.add("You will do your best today Morning!");
		list.add("You will do your best today Evening!");
		list.add("You will do your best today Afternoon!");
	}


	@Override
	public String getFortune() {
		Random random = new Random();
		return list.get(random.nextInt(3));
	}

}
