package p1;
import static utils.CollectionUtils.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Product;

public class Test1 {

	public static void main(String[] args) {
		//get list of products from utils
		List<Product> list = populateData();
		System.out.println("Original product list");
		//display original list
		list.forEach(p -> System.out.println(p));
		//using function literal , sort the products as per product price.
		Comparator<Product> comp =(p1,p2) -> ((Double)p1.getPrice()).compareTo(p2.getPrice());
		Collections.sort(list, comp);
		//display sorted products.
		System.out.println("Sorted  product list");
		list.forEach(p -> System.out.println(p));
		

	}

}
