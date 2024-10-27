package test_enum;

import java.util.Arrays;
import java.util.Scanner;
import static test_enum.Department.*;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Valid Departments to choose from : " + Arrays.toString(values()));
			System.out.println("Enter dept name");
			Department selectedDepartment=valueOf(sc.next().toUpperCase());
			//=> parsing (string --> enum) : success
			System.out.println("You chose "+selectedDepartment);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
