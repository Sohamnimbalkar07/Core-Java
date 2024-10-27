package tester;

import java.util.Scanner;
import static utils.CollectionUtils.*;
import static utils.IOUtils.storeProductDetails;

public class StoreDetails {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter bin file name to store product details");
			storeProductDetails(populateMapFromList(populateData()), sc.nextLine());
			System.out.println("products stored...");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
