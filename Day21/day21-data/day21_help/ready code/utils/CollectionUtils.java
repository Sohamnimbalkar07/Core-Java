package utils;

import java.text.ParseException;
import java.util.HashMap;

import com.app.core.Student;
import static com.app.core.Student.sdf;
import static com.app.core.Subject.*;

public interface CollectionUtils {
	// add a static method to return populated map of students
	static HashMap<String, Student> populateMap() {
		HashMap<String, Student> map = new HashMap<>();
		map.put("dac-001", new Student("dac-001", "Riya", parse("1995-03-17"), JAVA, 7.59));
		map.put("dac-008", new Student("dac-008", "Anish", parse("1998-01-29"), ANGULAR, 7.9));
		map.put("dac-003", new Student("dac-003", "Rama", parse("1995-12-09"), DBT, 7.81));
		map.put("dac-004", new Student("dac-004", "Priya", parse("1997-01-01"), JAVA, 8.12));
		map.put("dac-002", new Student("dac-002", "Mihir", parse("1996-10-21"), JAVA, 7.47));
		map.put("dac-007", new Student("dac-007", "Rahul", parse("1997-07-22"), REACT, 8.51));
		map.put("dac-005", new Student("dac-005", "Shreya", parse("1999-08-13"), WT, 8.3));
		map.put("dac-009", new Student("dac-009", "Ritesh", parse("1995-03-12"), JAVA, 7.5));
		map.put("dac-011", new Student("dac-011", "Rutu", parse("1997-08-29"), ANGULAR, 8.33));
		map.put("dac-006", new Student("dac-006", "Sahil", parse("1999-12-09"), DBT, 8.56));
		map.put("dac-010", new Student("dac-010", "Meeta", parse("1998-01-01"), JAVA, 7.19));
		map.put("dac-020", new Student("dac-020", "Kirti", parse("1996-11-21"), JAVA, 9.08));
		map.put("dac-014", new Student("dac-014", "Raj", parse("1997-06-20"), REACT, 8.55));
		map.put("dac-015", new Student("dac-015", "Pallavi", parse("1999-08-23"), WT, 8.39));
		return map;
	}
}
