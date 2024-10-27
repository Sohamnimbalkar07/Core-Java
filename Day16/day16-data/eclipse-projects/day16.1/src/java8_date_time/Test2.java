package java8_date_time;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Current time "+LocalTime.now());
		//time stamp : Date + Time
		System.out.println("Current timestamp "+LocalDateTime.now());

	}

}
