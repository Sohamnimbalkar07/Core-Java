package tester;

import com.app.core.Student;
import com.app.core.Person;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1 = new Student("Rama", "Seth", 2020, "PG-DAC", 123456, 75);
    Person p = s1;
    System.out.println(p);
    
	}

}
