package tester;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Product;

import static utils.IOUtils.restoreProductDetails;

public class RestoreDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			Map<Integer, Product> map = restoreProductDetails(sc.nextLine());
			System.out.println("Restored product details");
			map.forEach((k, v) -> System.out.println(v));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
