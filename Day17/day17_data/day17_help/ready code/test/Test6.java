package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test6 {

//	static void sum(double a,int b) {
//		System.out.println(a+b);
//	}
//	
//	static void sum(int a,double b) {
//		System.out.println("gefefrfref");
//		System.out.println(a+b);
//	}
	
	public static void main(String[] args) {
		
		//sum(5.0,5);
//		int i=9;
//		Integer o = i;
//		o=10;
//		int j =8;
//		o=j;
//		System.out.println(o);
		String s1 = new String("aniket");
		String s2 = new String("aniketjain");
		String s4 ="aniketjain";
		String s5="aniket";
		String s3 = s5+"jain";
		System.out.println(s3==s4);
		List<Integer> l = new ArrayList<>();
		Collections.sort(l, new Comparator<Integer>(){
		
			@Override
		public int compare(Integer s1, Integer s2) {
				// TODO Auto-generated method stub
				return s1.compareTo(s1);
			};
	});
		
		Collections.sort(l, (i1,i2) -> i1.compareTo(i2));
	
}
}
