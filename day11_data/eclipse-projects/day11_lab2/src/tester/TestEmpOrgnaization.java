package tester;

import static com.app.core.Employee.sdf;
//can directly access validateEmail method of the ValidationRules class
import static utils.ValidationRules.*;

import java.util.Date;
import java.util.Scanner;

import com.app.core.Department;
import com.app.core.Employee;

import custom_exceptions.EmpHandlingException;

public class TestEmpOrgnaization {

	public static void main(String[] args) {
		// scanner --try--with-resources --since Scanner IS-A AutoCloseable
		try (Scanner sc = new Scanner(System.in)) {
			// array
			System.out.println("Enter Max no of emps to hire");
			Employee[] emps = new Employee[sc.nextInt()];// array object --all array slots inited to null
			// exit , counter
			boolean exit = false;
			int counter = 0;

			// while --options 1. Hire Emp 2. Display all 3.Update10.Exit
			while (!exit) {
				System.out.println("Options 1. Hire Emp 2. Display 3.Update Emp Details 4. Link Adhar Card 10.Exit");
				System.out.println("Choose");
				try {

					// switch-case
					switch (sc.nextInt()) {
					case 1:
						if (counter < emps.length) {
							System.out.println(
									"Enter emp details --empId,  firstName,  lastName,  email,  deptId, joinDate(day/mon/yr) salary ");
							Employee e = validateAllInputs(sc.nextInt(), emps, sc.next(), sc.next(), sc.next(),
									sc.next(), sc.next(), sc.nextDouble());
							emps[counter++] = e;
							System.out.println("emp hired!!!!");

						} else // throw custom exc --recruitment over
							throw new EmpHandlingException("Recruitment over!!!!!");

						break;
					case 2:
						System.out.println("Emp Details");
						for (Employee e : emps)
							if (e != null)
								System.out.println(e);
						break;
					case 3:
						System.out.println("Enter emp id , new dept , salary increment");
						// check if emp exists
						Employee details = getEmpDetails(sc.nextInt(), emps);
						// =>emp found , validate new dept
						Department validDept = validateDept(sc.next());
						// => emp id n new dept : valid
						// change dept
						details.setDeptId(validDept);
						// update salary
						details.setSalary(details.getSalary() + sc.nextDouble());
						System.out.println("Updated emp details....");
						break;
					case 4: System.out.println("Enter emp id to link card details");
						details=getEmpDetails(sc.nextInt(), emps);
						//=>valid emp id , details => current emp details (except card details)
						System.out.println("Enter card details :  cardNumber,  creationDate,  location");
						details.linkAdharCard(sc.next(),sdf.parse(sc.next()) ,sc.next());
						System.out.println("Adhar card details linked for emp");
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
