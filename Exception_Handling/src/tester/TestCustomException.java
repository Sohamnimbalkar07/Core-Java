package tester;

import static utils.ValidationRules.validateSpeed;
import java.util.Scanner;
public class TestCustomException {

	public static void main(String[] args)  {
		
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter current Speed");
			validateSpeed(sc.nextInt());
			System.out.println("end of try");
		}
		catch (Exception e)
		
		{
			e.printStackTrace();
		}
		
		System.out.println("main over");

	}

}






