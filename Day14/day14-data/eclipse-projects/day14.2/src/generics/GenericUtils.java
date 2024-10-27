package generics;

import java.util.List;

public class GenericUtils {
	/*
	 * Objective : Create a class GenericUtils , as a non generic class 1. Add a
	 * static method to print elements of any type of the List.
	 */
	public static void printList(List<?> list)
	{
		for(Object e: list)
			System.out.println(e);
	}
	//Can you achieve similar objective as above BUT using a generic method ? YESS
	//use a generic method with type declaration.
	public static <T> void printList2(List<T> list)
	{
		for(T t : list)
			System.out.println(t);
	}
	//Add a static method to compute salary of List of emps / mgr/ salesmgr / tempworker.....
//	public static void invokeComputeSalary(List<Emp> list)
//	{
//		for(Emp o : list)
//			o.computeSalary();
//	}
	public static void invokeComputeSalary(List<? extends Emp> list)
	{
		for(Emp o : list)
			o.computeSalary();
	}
	
}
