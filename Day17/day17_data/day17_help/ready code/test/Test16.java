package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test16 {
	
	static int minimumTime(int n, int[] a, char[] b){

	    int res = 0;
	    Map<Character, Integer> map=new TreeMap<>();
	    for(int i=0;i<n ;i++) {
	    	if(map.containsKey(b[i])) {
	    		if(map.get(b[i])>a[i]) {
	    			map.put(b[i], a[i]);
	    		}
	    	}
	    	else {
	    		map.put(b[i], a[i]);
	    	}
	    }
	    int count1=0;
	    int count2=0;
	    for(Map.Entry<Character, Integer> m : map.entrySet()) {
	    	if(m.getKey()=='A' || m.getKey()=='B') {
	    		if(count1<m.getValue()) {
	    			count1=m.getValue();
	    		}
	    	}
	    }
	    
	    
	    
	    return res;
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    char[] b = new char[n];
	    for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	        b[i] = sc.next().charAt(0);
	    }
	    System.out.println(minimumTime(n,a,b));
	}
	
}
		   

