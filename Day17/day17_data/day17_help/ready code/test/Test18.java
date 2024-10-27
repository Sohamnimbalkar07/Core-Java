package test;

import java.util.Scanner;



public class Test18 {
	
	public static boolean isPrime(int num) {
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	  if(!flag)
		  return true;
	  else
		  return false;
	}
	
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int count = 0;
	    int[] arr= {1,3,5,7,10};
	    if(n<=0)
	    	System.out.println(count);
	    while(n!=0) {
	    	if(n>=10) {
	    		n=n-10;
	    		count++;
	    	}
	    	else if (n>=7) {
	    		n=n-7;
	    		count++;
	    	}
	    	else if (n>=5) {
	    		n=n-5;
	    		count++;
	    	}
	    	else if (n>=3) {
	    		n=n-3;
	    		count++;
	    	}
	    	else if (n>=1) {
	    		n=n-1;
	    		count++;
	    	}
	    	
	    }
	    System.out.println(count);
	    

	}
}
