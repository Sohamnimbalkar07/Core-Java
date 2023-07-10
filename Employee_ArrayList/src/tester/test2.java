package tester;
import com.app.core.Employee;
import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Employee;

public class test2 {

	public static void main(String[] args) {
	ArrayList<Employee> empList  = new ArrayList<>();
	empList.add(new Employee(10,"soham","Nimbalkar","sohamnimbalkar@gmail.com","HR",20000));
	empList.add(new Employee(20,"Shubham","Tipale","shubhamtipale@gmail.com","Finance",30000));
	empList.add(new Employee(30,"Tushar","Bidave","tusharbidave@gmail.com","RND",40000));
	empList.add(new Employee(40,"Aniket","kudale","aniketkudale@gmail.com","HR",50000));
	empList.add(new Employee(50,"prashant","awate","prashantawate@gmail.com","RND",60000));
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a threshold salary");
	 int salary = sc.nextInt();
	 for(Employee e12 : empList)
	 {
		 if(e12.getSalary() > salary)
		 {
			 empList.remove(e12);
		 }
	 }
	}
}
