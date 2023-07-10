package tester;
import java.util.Scanner;


import java.util.ArrayList;
import java.util.Collections;
import com.app.core.EmpSalaryComparator;
import com.app.core.Employee;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
public class TestEmpOrgnaization {

	public static void main(String[] args) {
	
		ArrayList<Employee> empList  = new ArrayList<>();
		empList.add(new Employee(30,"soham","Nimbalkar","sohamnimbalkar@gmail.com","HR",40000));
		empList.add(new Employee(20,"Shubham","Tipale","shubhamtipale@gmail.com","Finance",30000));
		empList.add(new Employee(50,"Tushar","Bidave","tusharbidave@gmail.com","RND",90000));
		empList.add(new Employee(40,"Aniket","kudale","aniketkudale@gmail.com","HR",20000));
		empList.add(new Employee(10,"prashant","awate","prashantawate@gmail.com","RND",50000));
		Scanner sc = new Scanner(System.in);
		
        boolean exit = false;
        int count = 0;
        int choice;
        while(!exit)
        {
        	System.out.println(
					"Options 1. Hire Emp 2. Display All Emps details 3.get specifird emp details 4. update salaryy "
							+ "5.Display Specific Dept Employee 6.remove specific employee 7. remove employee by id 8. Sort emps as per emp id 9. reverse list 10.sort according to salary");
        	
        	System.out.println("Enter Choice");
        	choice = sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        		System.out.println(
						"Enter emp details --empId,  firstName,  lastName,  email,  department,salary ");
				Employee e1 = new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt());
				empList.add(e1);
				System.out.println("emp hired");
			    break;
				
        	case 2 :
//        		for(Employee e : empList)
//				{
//					System.out.println(e);
//				}
				
				Iterator<Employee> empItr= empList.iterator();
				while(empItr.hasNext())
				{
					System.out.println(empItr.next());
				}
				break;
			
        	 case 3:
        		 System.out.println("enter emp id");
        		 
        		 
					int index = empList.indexOf(new Employee(sc.nextInt()));
					System.out.println(empList.get(index));
					break;
        		 
        	 case 4:
        		 System.out.println("enter a empid and incremented salary");
        		 int id = sc.nextInt();
        		 int salary  = sc.nextInt();
        		 index = empList.indexOf(new Employee(id));
        		 Employee e = empList.get(index);
        		 e.setSalary(e.getSalary()+ salary);
        		 break;
 				
        	 case 5:
        		 System.out.println("enter a dept name");
        		 String dept= sc.next();
        		 Iterator<Employee> itr = empList.iterator();
        		 while(itr.hasNext())
        		 {
        			 Employee e11 = itr.next();
        			 if(e11.getDepartment().equals(dept))
        			 {
        				 System.out.println(e11.getFirstName() + " "+ e11.getLastName());
        			 }
        			 
        		 }
        		 break;
        	 case 6:
        		 System.out.println("enter a threshold salary");
        		 salary = sc.nextInt();
        		 Iterator<Employee> itr1 = empList.iterator();
        		 while(itr1.hasNext())
        		 {
        			 if(itr1.next().getSalary()>salary)
        			 {
        				 itr1.remove();
        			 }
        			 
        		 }
        		 break;
        	 case 7:
        		 System.out.println("enter a empid");
        		 int id1 = sc.nextInt();
        		 empList.remove(new Employee(id1));
        	
        	 case 8:
        		 Collections.sort(empList);
        		
        	 case 9:
        		 ListIterator<Employee> litr = empList.listIterator(empList.size());
        		 while(litr.hasPrevious())
        		 {
        			 System.out.println(litr.previous());
        		 }
        		 
        	 case 10:
        		 Collections.sort(empList, new EmpSalaryComparator());
         	}
        }
}
	    
}


