package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test15 {

	   public static void main (String[] args) {
	        ArrayList<Integer> arrayList = new ArrayList<Integer>();
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        for (int i = 0; i < n; i++) {
	            arrayList.add(scan.nextInt());
	        }
	        int count = 0;
	        for (int i = 0; i < arrayList.size(); i++) {
	            if (arrayList.get(i) % 2 == 1) {
	                int j = i;
	                while (j < arrayList.size() && arrayList.get(j) % 2 == 1) {
	                    j++;
	                }
	                if (j - i >= 1 && arrayList.get(i) > 10) {
	                    count++;
	                }
	                i = j - 1;
	            }
	        }
	        System.out.println(count);

	                
	    
	        
	    }
 }
