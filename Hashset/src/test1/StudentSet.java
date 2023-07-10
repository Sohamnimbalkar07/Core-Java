package test1;
import java.util.HashSet;
import com.app.core.Student;
public class StudentSet {

	public static void main(String[] args) {
		
		HashSet<Student> students = new HashSet<>();
		Student s1 = new Student(10,"soham","pune");
		Student s2 = new Student(20,"mohit","Indapur");
		System.out.println(students.add(s1));
		System.out.println(students.add(s2));
		
		students.add(new Student(30,"Rohit","baramati"));
		students.add(new Student(40,"Abhi","Nagar"));
		System.out.println(students);
	}

}
