package com.satyam.springdemo;

public class BaseballCoach implements Coach {
	
	// define a private field for dependency.
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		// Baseball coach cannot tell fortune, so it needs the helper FortuneService.
		return fortuneService.getFortune();
	}

}








