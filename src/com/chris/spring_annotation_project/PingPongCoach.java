package com.chris.spring_annotation_project;

import org.springframework.stereotype.Component;


@Component
public class PingPongCoach implements Coach{
	

	public PingPongCoach() {
//		System.out.println(">> PingPongCoach: inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
