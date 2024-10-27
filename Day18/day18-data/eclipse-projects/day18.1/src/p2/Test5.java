package p2;

import java.util.List;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;

import static utils.CollectionUtils.populateData;

public class Test5 {

	public static void main(String[] args) {
		/*
		 * 4. Display all product names of a particular category , exceeding specific
		 * price. I/P category name & price. (stream,filters,forEach) eg : productList :
		 * List<Product>
		 */
		try(Scanner sc=new Scanner(System.in))
		{
			List<Product> list = populateData();
			System.out.println("Original list");
			list.forEach(System.out::println);
			System.out.println("Enter category n discount");
			Category category=Category.valueOf(sc.next().toUpperCase());
			double discount=sc.nextDouble();
			System.out.println("Discounted  list of products ");
			//get list of products
			list.stream()
			.filter(p -> p.getProductCatgeory() == category)
			.forEach(p -> p.setPrice(p.getPrice()-discount));
			list.forEach(System.out::println);
			
			
		}

	}

}
