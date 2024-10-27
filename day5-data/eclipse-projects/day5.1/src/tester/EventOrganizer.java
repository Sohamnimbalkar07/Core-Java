package tester;

import java.util.Scanner;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

/*
 * 2. Event Organizer app
 Suitable data structure : array of references 
Type of array : Student[] or Faculty[] : wrong options
correct : Person[] 

Menu :
1 : Register Student
2. : Register Faculty
3. Display all participant details 
100. : Exit
 */

public class EventOrganizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max no of participants");// 20
		Person[] participants = new Person[sc.nextInt()];// array of refs
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println("Options 1. Register Student 2. Register Faculty 3.Display Details of all participants "
					+ "4. Display specific participant details 5. Invoke subclass specific functionality 100.Exit");
			System.out.println("Choose Option");
			switch (sc.nextInt()) {
			case 1: // student reg.
				if (counter < participants.length) {
					System.out
							.println("Enter student details -firstName,  lastName,  gradYear,  course,  fees,  marks");
					// up casting
					participants[counter] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(),
							sc.nextInt());
					counter++;
				} else
					System.out.println("Event Full!!!!!");
				break;
			case 2: // faculty registration
				if (counter < participants.length) {
					System.out.println("Enter Faculty Details -firstName,  lastName  experience in yrs, sme ");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
				} else
					System.out.println("Event Full!!!!!");
				break;
			case 3:// display details of all participants : for-each
				for (Person p : participants)// p=participants[0],......p=participants[participants.length-1]
					if (p != null) // null checking
						System.out.println(p);// type of ref : Person , type of object : student or faculty
				// {f1,f2,s1,s2,s3,null,null....}

				break;
			case 4:
				System.out.println("Enter seat no");
				int index = sc.nextInt() - 1;
				if (index >= 0 && index < counter)
					System.out.println(participants[index]);
				else
					System.out.println("Invalid seat no!!!!!");

				break;
			case 5: // {f1,f2,s1,s2,s3,null,null....}
				System.out.println("Enter seat no");
				index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) {
					Person p = participants[index];
					// p.study();// javac resolves by type of the reference . p : Person , why javac
					// err : since
					// there is no "study" method defined in Person class
					// in order to avoid ClassCastException , MUST use instanceof checking before
					// doing
					// down casting
					// down casting : climbing down inheritance hierarchy (not done implicitly by
					// the javac)
					if (p instanceof Student)
						((Student) p).study();
					else
						((Faculty)p).teach();
				} else
					System.out.println("Invalid seat no!!!!!");
				break;
			case 100:
				exit = true;

				break;

			}
		}
		sc.close();

	}

}
