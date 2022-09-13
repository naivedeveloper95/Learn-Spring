package com.satyam.springdemo;

public class CricketCoach implements Coach {

	
	// Setup the private fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;

	// create a no-arg constructor 
	public CricketCoach() {
		System.out.println("CricketCoach :: Inside CricketCoach constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach :: Inside setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach :: Inside setTeam");
		this.team = team;
	}

	// Setter method for CricketCoach class
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach :: Inside setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes a day!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
