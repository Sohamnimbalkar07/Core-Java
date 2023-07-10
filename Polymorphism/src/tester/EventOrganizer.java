package tester;

import java.util.Scanner;

import com.app.core.Person;
import com.app.core.Student;
import com.app.core.Faculty;

public class EventOrganizer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[10];
        boolean exit = false;
        int count = 0;
        int choice;
        while(!exit)
        {
        	System.out.println("Options 1. Register Student 2. Register Faculty 3.Display Details of all participants "
			+ "4. Display specific participant details 5. Invoke subclass specific functionality 10.Exit");
        	
        	System.out.println("Enter Choice");
        	choice = sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        		if(count < p.length)
        		{
        			System.out.println("Enter student details -firstName,  lastName,  gradYear,  course,  fees,  marks");
        			p[count] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(),sc.nextInt());
        			count++;
        		}
        		
        		else
        		{
					System.out.println("Event Full!!!!!");
        		}
				break;
				
        	case 2 :
        		if(count < p.length) {
					System.out.println("Enter Faculty Details -firstName,  lastName  experience in yrs, sme ");
					p[count++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
				} else
					System.out.println("Event Full!!!!!");
				break;
			
        	 case 3:
        		 for(Person p1 : p)
        		 {
        			 if(p1 != null)
        			 {
        				 System.out.println(p1);
        			 }
        		 }
        		 break;
        		 
        	 case 4:
        		 System.out.println("enter a seat no");
        		 int index = sc.nextInt() -1;
        		 if (index >= 0 && index < count)
 					System.out.println(p[index]);
 				else
 					System.out.println("Invalid seat no!!!!!");

 				break;
 				
        	 case 5:
        		 System.out.println("enter a seat no");
        		 index = sc.nextInt() -1;
        		 if (index >= 0 && index < count)
        		 {
        			 Person p1 = p[index];
        			 
        			 if(p1 instanceof Student)
        			 {
        				 ((Student)p1).study();
        			 }
        			 else
        				 ((Faculty)p1).teach();
        	     }
        		 
         	}
        }
	}

}
