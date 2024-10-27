package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.app.core.Category;
import com.app.core.Product;

public interface IOUtils {
//add a static method to store product details in a bin file
	static void storeProductDetails(Map<Integer, Product> map, String fileName) throws IOException {
		// Java App --> DOS ---> BOS --> FOS --> File
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
			// write
			map.forEach((k, v) -> {
				try {
					// int id, String name, Category productCatgeory, LocalDate manufactureDate,
					// double price
					out.writeInt(v.getId());// id
					out.writeUTF(v.getName());
					out.writeUTF(v.getProductCatgeory().toString());
					out.writeUTF(v.getManufactureDate().toString());
					out.writeDouble(v.getPrice());
				} catch (IOException e) {
					System.out.println("err in writing " + e);
				}

			});

		}
	}

	// add a static method to restore map of products from a bin file
	static Map<Integer, Product> restoreProductDetails(String fileName) throws IOException {

		// create empty map
		HashMap<Integer, Product> map = new HashMap<>();
		// validations
		// create File class instance for validations
		File file = new File(fileName);
		if (file.exists() && file.isFile() && file.canRead()) {
			// => valid file --continue to attach data strms
			// Java App <---- DIS------BIS<-----FIS <---- Bin File

			try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {

				while (true) {
					int id = in.readInt();
					// int id, String name, Category productCatgeory, LocalDate manufactureDate,
					// double price
					map.put(id, new Product(id, in.readUTF(), Category.valueOf(in.readUTF()),
							LocalDate.parse(in.readUTF()), in.readDouble()));
				}
				// ret populated map restored from bin file
			} catch (EOFException e) {
				System.out.println("data read complete....");
				return map;
			}
		} else // => invalid file name : return empty Map
			return map;

	}
}
