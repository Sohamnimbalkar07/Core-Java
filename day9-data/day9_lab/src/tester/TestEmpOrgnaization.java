package tester;

import java.util.Date;
import java.util.Scanner;
import com.app.core.Employee;
import custom_exceptions.EmpHandlingException;
//can directly access validateEmail method of the ValidationRules class
import static utils.ValidationRules.validateEmail;
import static com.app.core.Employee.sdf;

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

			// while --options 1. Hire Emp 2. Display all 3.Exit
			while (!exit) {
				System.out.println("Options 1. Hire Emp 2. Display 3.Exit");
				System.out.println("Choose");
				try {

					// switch-case
					switch (sc.nextInt()) {
					case 1:
						if (counter < emps.length) {
							System.out.println(
									"Enter emp details --empId,  firstName,  lastName,  email,  deptId, joinDate salary ");
							Employee e = new Employee(sc.nextInt(), sc.next(), sc.next(), validateEmail(sc.next()),
									sc.next(),sdf.parse(sc.next()), sc.nextDouble());
							//=>valid inputs
							emps[counter++]=e;
							System.out.println("emp hired!!!!");
							

						} else // throw custom exc --recruitment over
							throw new EmpHandlingException("Recruitment over!!!!!");

						break;
					case 2:
						System.out.println("Emp Details");
						for(Employee e : emps)
							if(e != null)
								System.out.println(e);
						break;
					case 3:
						exit = true;

						break;

					}// switch over
				} // inner try over
				catch (Exception e) {
					System.out.println("Error " + e);
				}
				//clear off all pending inputs from scanner buffer till next line
				sc.nextLine();

			}//end of while
		} // try-with-resources over : sc.close()

	}// main over

}// cls over
