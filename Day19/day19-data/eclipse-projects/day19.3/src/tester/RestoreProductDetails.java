package tester;

import java.util.Scanner;
import static utils.SerIOUtils.restoreProductDetails;

public class RestoreProductDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name to restore products");
			System.out.println(restoreProductDetails(sc.nextLine()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
