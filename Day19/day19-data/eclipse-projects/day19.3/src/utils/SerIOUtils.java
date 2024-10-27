package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface SerIOUtils {
//add a static method for de-serialization(restoring java obj/s from bin strm)
	static Object restoreProductDetails(String fileName) throws IOException,ClassNotFoundException{
		//validations
		//1. create File class instance
		File file=new File(fileName);
		if(file.exists() && file.isFile() && file.canRead())
		{
			//attach data strms for de-serial
			//Java App   <----- OIS <-----FIS<-----Bin File 
			try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(file)))
			{
				return in.readObject();//de-serial
			}
		}else 
			return null;
		
	}
}
