package tester;

import java.util.Scanner;

import com.app.students.Student;

public class StudentAdmission {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter max no of students for admission");
			Student[] students = new Student[sc.nextInt()];
			int counter = 0;
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1.Admit Student 2. Display All 3.Exit");
				System.out.println("Choose Option");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter Student's roll no n subject");
					Student newStudent = new Student(sc.nextInt(), sc.next());
					// chk for duplication
					boolean found = false;
					for (Student s : students)
						if (s != null)
							if (s.equals(newStudent)) {
								found = true;
								break;
							}
					if(!found)
					{
						//no dup found
						System.out.println("Enter firstName,  lastName,  gpa");
						newStudent.setFirstName(sc.next());
						newStudent.setLastName(sc.next());
						newStudent.setGpa(sc.nextDouble());
						students[counter++]=newStudent;
						System.out.println("Student admission done!");
					}
					else
						System.out.println("Student admission failed : dup details");	
					break;

				case 2:
					System.out.println("Student Details");
					for(Student s : students)
						if(s != null)
							System.out.println(s);
					break;
				case 3:
					exit = true;
					break;
				}
			}
		}

	}

}
