package test;

import java.util.HashMap;
import java.util.Map;

public class Test10 {
	static int countSubseq(int arr[], int n)
	{
	    int count = 0;
	  
	    // creating a map to count the frequency of each element
	    HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();
	  
	    // store frequency of each element
	    for (int i = 0; i < n; i++)
	        if (mp.containsKey(arr[i]))
	            mp.put(arr[i],mp.get(arr[i])+1);
	        else
	            mp.put(arr[i],1);
	  
	    // iterate through the map
	    for (Map.Entry<Integer,Integer>entry:mp.entrySet()) {
	  
	        // add all possible combination for key equal zero
	        if (entry.getKey() == 0)
	            count += Math.pow(2, entry.getValue()) - 1;
	  
	        // add all (odd number of elements) possible
	        // combination for key other than zero
	        else
	            count += Math.pow(2, entry.getValue()- 1);
	    }
	    return count;
	}
	  
	// driver function
	public static void main(String[] args)
	{
	    int arr[] = { 1,2,3,4 };
	    int n=arr.length;
	    System.out.println(countSubseq(arr, n));
	}
}
