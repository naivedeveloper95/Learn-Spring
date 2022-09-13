package com.satyam.springdemo;

import java.util.Random;

public class DelightFortuneService implements FortuneService {

	private String[] data = { 
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return data[random.nextInt(data.length)];
	}

}
