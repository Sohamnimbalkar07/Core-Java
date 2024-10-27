package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/* Save this in a file called Main.java to compile and test it /

	/ Do not add a package declaration /
	import java.util.;
	import java.io.;

	/ You may add any imports here, if you wish, but only from the 
	   standard library */

	    public static int processArray(ArrayList<Integer> array) {
	        /* 
	         * Modify this function to process array as indicated
	         * in the question. At the end, return the appropriate
	         * value.
	         *
	         * Please create appropriate classes, and use appropriate
	         * data structures as necessary.
	         *
	         * Do not print anything in this method
	         *
	         * Submit this entire program (not just this function)
	         * as your answer
	         */
	
	    	 int count = 0;
		        for (int i = 0; i < array.size(); i++) {
		            if (array.get(i) % 2 == 1) {
		                int j = i;
		                while (j < array.size() && array.get(j) % 2 == 1) {
		                    j++;
		                }
		                if (j - i >= 2 && array.get(i) > 10) {
		                    count++;
		                }
		                i = j - 1;
		            }
		        }
		        return count;

	
	    }

	    public static void main (String[] args) {
	        ArrayList<Integer> arrayList = new ArrayList<Integer>();
	        Scanner in = new Scanner(System.in);
	        while(in.hasNextInt()) {
	            int num = in.nextInt();
	            if (num < 0) 
	                break;
	            arrayList.add(new Integer(num));
	        }
	        int result = processArray(arrayList);
	        System.out.println(result);
	    }
	}

