package utils;

import custom_exception.SpeedOutOfRangeException;

public class ValidationRules {

	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	
	static {
		MIN_SPEED = 40;
		MAX_SPEED= 80;
	}
	
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException
	{
		if(speed < MIN_SPEED)
		{
			throw new SpeedOutOfRangeException("you are driving too slow");
		}
		if(speed > MAX_SPEED)
		{
			throw new SpeedOutOfRangeException("you are driving too fast");
		}
		
		System.out.println("speed within range....");
	}
	
}

