package tester;

import java.util.Scanner;
import static utils.CollectionUtils.*;
import static utils.SerIOUtils.storeProductDetails;

public class StoreProductDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			storeProductDetails(populateMapFromList(populateData()), sc.nextLine());
			System.out.println("products stored...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
