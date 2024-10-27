package test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,7,8,9};
		System.out.println(findMissing(arr));
	}
	
	public static int findMissing(int[] a) {
		
		int last =a[a.length-1];
		int sum = (last*(last +1 ))/2;
		
		int sum1 =0;
		for (int j=0 ;j<a.length;j++) {
			sum1=sum1+a[j];
		}
		
		
		return sum-sum1;
	}
}

