package test;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

		 int n, l, r, i;
		    n=sc.nextInt();
		    for (i=0; i<n; i++){
		        l =sc.nextInt();
		        r =sc.nextInt();
		        findPrimeRanger(l, r);
		    }
	}
	static boolean  returnPr(int l) {
		int count2=0,count3=0,count5=0,count7=0;
		while(l>0) {
			int num = l % 10;
	        if(num == 2){
	            count2 ++;
	        }
	        else if (num == 3){
	            count3 ++;
	        }
	        else if (num == 5){
	            count5 ++;
	        }
	        else if (num == 7){
	            count7 ++;
	        }
	        l = l/10;
	    
		}
		 if (count2 >= count3 && count3 >= count5 && count5 >= count7)
			    {
			        return true;
			    }
			    else
			    {
			        return false;
			    }
	}
	
	static void findPrimeRanger(int l,int r)
	{
	    int i;
	    boolean res;
	    int pr = 0;
	    for (i=l; i<=r; i++)
	    {
	        res = returnPr(i);
	        if(res == true)
	        {
	            pr ++;
	        }
	    }
	    System.out.println(pr);
	}
}
