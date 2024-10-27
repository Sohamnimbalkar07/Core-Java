package prim_arrays;

import java.util.Scanner;

/*
 * Objective -- Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.

Accept data from User(scanner) & store it in the array.

Display array data using for-each loop
 */
public class Test1 {

	public static void main(String[] args) {
		//create a scanner instance attached to std i/p
		Scanner sc=new Scanner(System.in);
		//print the name of the class loaded for above scanner object
		System.out.println("name of the cls loaded for scanner "+sc.getClass());//java.util.Scanner
		System.out.println("Enter size of the array");//10
		//create double[] of user specified size
		double[] data;//data : ref type of var (array type) --mem allocated on : stack --not inited
		//System.out.println(data);/javac err
		data=new double[sc.nextInt()];//array class is loaded in the method area(metaspace) : [D -->
		//1 array object is created on the heap
		System.out.println("Name of the class loaded for double[] "+data.getClass());
		//display array data : for loop
		System.out.println("Default array contents via for loop");
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);//0.0 .......0.0
		System.out.println("Default array contents via for-each loop");
		for(double d : data)//d=data[0],d=data[1]......d=data[data.length-1]
			System.out.println(d);
		
		//Accept data from User(scanner) & store it in the array.
		for(int i=0;i<data.length;i++)
		{
			System.out.println("Enter data");
			data[i]=sc.nextDouble();
		}
		//display array data using for-each
		
		System.out.println("inited array contents via for-each loop");
		for(double d : data)//d=data[0],d=data[1]......d=data[data.length-1]
			System.out.println(d);
	
		//close scanner
		sc.close();

	}

}
