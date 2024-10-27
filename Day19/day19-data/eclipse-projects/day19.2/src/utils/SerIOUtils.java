package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Product;

public interface SerIOUtils {
//add a static method to store map of products in a bin file using serialization
	static void storeProductDetails(Map<Integer, Product> map,String fileName) throws IOException
	{
		//Java App ---> OOS --> binary strm --> FOS ---> bin file
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(map);//serialization= conversion of the state of the object + meta data info ---> bin strm
		}
		
	}
}
