package tester;

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;

import runnable_tasks.DoBSorter;
import runnable_tasks.GPASorter;

import static utils.CollectionUtils.populateMap;

public class TestCollectionIOThreads {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//populate map from sample data
			HashMap<String, Student> map = populateMap();
			System.out.println("Enter file name to store gpa sorted details");
			String fileName1=sc.nextLine();
			System.out.println("Enter file name to store dob sorted details");
			String fileName2=sc.nextLine();
			//create tasks , attach thrds to the tasks , start the same
			//Thread(Runnable task,String thrdName)
			Thread t1=new Thread(new GPASorter(fileName1, map), "gpa_sorter");//NEW
			Thread t2=new Thread(new DoBSorter(fileName2, map), "dob_sorter");//NEW
			t1.start();
			t2.start();
			System.out.println("main waiting for child thrds to finish exec");
			t1.join();
			t2.join();
			System.out.println("main over....");
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
