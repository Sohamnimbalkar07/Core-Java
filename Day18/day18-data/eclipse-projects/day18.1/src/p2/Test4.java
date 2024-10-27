package p2;

import java.util.List;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;

import static utils.CollectionUtils.populateData;

public class Test4 {

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
			System.out.println("Enter category n price");
			Category category=Category.valueOf(sc.next().toUpperCase());
			double price=sc.nextDouble();
			System.out.println("Filter list of products ");
			//get list of products
			list.stream() //Stream<Product> : all products
			.filter(p -> p.getProductCatgeory()==category) //filtered by category
			.filter(p -> p.getPrice() > price) //filtered by price
			.forEach(p -> System.out.println(p.getName()));
			
		}

	}

}
