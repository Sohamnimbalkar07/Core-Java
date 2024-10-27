package tester;

import static com.app.core.Employee.sdf;
//can directly access validateEmail method of the ValidationRules class
import static utils.ValidationRules.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.app.core.Department;
import com.app.core.Employee;

import custom_exceptions.EmpHandlingException;

public class TestEmpOrgnaization {

	public static void main(String[] args) {
		// scanner --try--with-resources --since Scanner IS-A AutoCloseable
		try (Scanner sc = new Scanner(System.in)) {
			// create Empty AL to hold Emp type of refs.
			ArrayList<Employee> empList = new ArrayList<>();// size=0,capa=10

			// exit , counter
			boolean exit = false;

			// while --options 1. Hire Emp 2. Display all 3.Update10.Exit
			while (!exit) {
				System.out.println("Options 1. Hire Emp 2. Display All Emps details 3.Update Emp Details 4. Link Adhar Card "
						+ "5.Display Specific Emp Details 6.Delete Emp Info 7. Display names joined after 10.Exit");
				System.out.println("Choose");
				try {

					// switch-case
					switch (sc.nextInt()) {
					case 1:

						System.out.println(
								"Enter emp details --empId,  firstName,  lastName,  email,  deptId, joinDate(day/mon/yr) salary ");
						Employee e = validateAllInputs(sc.nextInt(), empList, sc.next(), sc.next(), sc.next(),
								sc.next(), sc.next(), sc.nextDouble());
						empList.add(e);
						System.out.println("emp hired!!!!");
						break;
					case 2:
						System.out.println("Emp Details");
						for (Employee e1 : empList)
							System.out.println(e1);
						break;
					case 3://update emp details
						System.out.println("Enter emp id , new dept , salary increment");
						// check if emp exists
						Employee details = getEmpDetails(sc.nextInt(), empList);
						// =>emp found , validate new dept
						Department validDept = validateDept(sc.next());
						// => emp id n new dept : valid
						// change dept
						details.setDeptId(validDept);
						// update salary
						details.setSalary(details.getSalary() + sc.nextDouble());
						System.out.println("Updated emp details....");
						break;
					case 4:
						System.out.println("Enter emp id to link card details");
						details = getEmpDetails(sc.nextInt(),empList);
						// =>valid emp id , details => current emp details (except card details)
						System.out.println("Enter card details :  cardNumber,  creationDate,  location");
						details.linkAdharCard(sc.next(), sdf.parse(sc.next()), sc.next());
						System.out.println("Adhar card details linked for emp");
						break;
					case 5://get specific emp details
						System.out.println("Enter emp id to fetch details");
						System.out.println(getEmpDetails(sc.nextInt(), empList));
						break;
					case 6 : //delete emp info 
						System.out.println("Enter emp id to fire");
						int index=empList.indexOf(new Employee(sc.nextInt()));
						if(index == -1)
							throw new EmpHandlingException("Emp deletion failed : Invalid emp id !!!!!!");
						//=>valid emp id
						System.out.println("Removed "+empList.remove(index));
						break;
					case 7 :
						System.out.println("Enter join date");
						Date joinDate=parseValidateJoinDate(sc.next());
						System.out.println("Emp Names  joined after "+sdf.format(joinDate));
						for(Employee e1: empList)
							if(e1.getJoinDate().after(joinDate))
								System.out.println(e1.getFirstName()+" "+e1.getLastName());
						break;
					case 10:
						exit = true;

						break;

					}// switch over
				} // inner try over
				catch (Exception e) {
					System.out.println("Error " + e);
					// System.out.println(e.getMessage());
				}
				// clear off all pending inputs from scanner buffer till next line
				sc.nextLine();

			} // end of while
		} // try-with-resources over : sc.close()

	}// main over

}// cls over
