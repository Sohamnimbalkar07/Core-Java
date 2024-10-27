package tester;

import com.app.core.*;

public class TestConstrInvocation {

	public static void main(String[] args) {
		// create student class instance
		Student student1 = new Student("Rama", "Seth", 2020, "PG-DAC", 123456, 75);
		System.out.println("--------------------------------");
		//create faculty instance
		Faculty faculty1=new Faculty("Kiran", "Mujumdar", 10, "Java React NOSQL");
		//display student details
		System.out.println(student1.toString());
		//display faculty details
		System.out.println(faculty1.toString());

	}

}
