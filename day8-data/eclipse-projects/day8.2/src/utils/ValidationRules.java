package utils;

import custom_exceptions.SpeedOutOfRangeException;

public class ValidationRules {
//define speed limits
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		System.out.println("in static init block");
		MIN_SPEED=30;
		MAX_SPEED=80;
	}
	//add a static method for speed validation
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException
	{
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow : causing jam");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("You are driving too fast : FATAL");
		System.out.println("speed within range....");
	}
}
