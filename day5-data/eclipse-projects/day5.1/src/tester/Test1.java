package tester;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class Test1 {

	public static void main(String[] args) {
		// create student class instance
		// super class ref , super class object , sub class ref , sub class object
		// Person : super class , Student sub class
		// direct referencing : sub cls ref ---> sub class object
		Student student1 = new Student("Rama", "Seth", 2020, "PG-DAC", 123456, 75);
		System.out.println(student1);// implicitly --student1.toString --student's toString is invoked
		Person p;// p : super class ref
		p = student1;// up casting : implict cast added by javac . (Student extends Person) : JVM
						// invokes' student's toString
		System.out.println(p);// p.toString --javac resolves method binding by type of the ref(Person)
		// BUT JVM resolves the method binding by type of the object it's referring to
		p = new Faculty("Kiran", "Mujumdar", 10, "Java React NOSQL");// up casting
		System.out.println(p);// p.toString : JVM will invokes toString on Faculty's object
		Object o;
		o=new Student("Rama123", "Seth456", 2021, "PG-DITISS", 12378, 77);//up casting
		System.out.println(o);
		o=new Faculty("Kiran11", "Mujumdar22", 12, "Java Angular MySQL");// up casting
		System.out.println(o);

	}

}
