package com.app.core;

public enum Department {
	SALES, HR, MARKETING, RND;
	//public static final Department SALES;--self types constants
	/*
	 * static {
	 *   SALES=new Department("SALES",0);
	 *   ....
	 *   RND =new Deparment("RND",3);
	 * }
	 * Methods --values , valueOf
	 * public static Department[] values();
	 * public static Department valueOf(String name) throws IllegalArgumentException
	 * 
	 */
//	@Override
//	public String toString()
//	{
//		System.out.println("in toString of Dept");
//		return ordinal()+":"+name();
//	}
	//Has Enum class overridden equals method of Object class ? YES
	//Can u override it further ? NO
	//Is Enum Comparable ? YES
	//What will be o/p
	//System.out.println(Department.RND.compareTo(Department.HR));
	
}
