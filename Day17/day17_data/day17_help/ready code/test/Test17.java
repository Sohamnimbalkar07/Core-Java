package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class a {
	
}
 class b extends a{
	 
 }

public class Test17 {
	
//	static String Challenge(String[] strArr) {
//	   String s = Integer.toBinaryString(Integer.parseInt(strArr[0]));
//	   int count=0;
//	   String str = strArr[1];
//	   
//	   for(int i=0;i<str.length();i++) {
//		   if(str.charAt(i)!=s.charAt(i)) {
//			   count++;
//		   }
//	   }
//	   return count+"";
//	}
//	public static void main (String[] args){
//	           
//	    String[] strarr = {"5624", "0010111111001"};
//	    System.out.println(Challenge(strarr));
//
//	    
//	    }

	public static int invite(int input1,int input2,int[][] input3,int input4,int input5){
	    int count=0;
	    int r=0;
	    int q=0;
	    
	    ArrayList<Integer> a = new ArrayList<>();
	    ArrayList<Integer> b = new ArrayList<>();
	    for(int i=0;i<input2;i++){
	    	a.add(input3[i][0]);
	    }
	    for(int i=0;i<input2;i++){
	    	b.add(input3[i][1]);
	    }
	    
	    while(r!=input5) {
	    	 q= b.indexOf(input4);
	    	 r=a.get(q);
	    	 count++;
	    	
	    }
//	for(int i=0;i<input2;i++) {
//		if(input3[i][1]==input4) {
//			r=input3[i][0];
//		}
//	}
//	int j=0;
//	while(r!=input5 && j<input2) {
//		if(input3[j][1]==r) {
//			r=input3[j][0];
//			count++;
//		}
//		j++;
//	}

	    return count;

	}
	
    public static String Solve_Trouble( int k, int a,int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        
       
        if(sum%k!=0 || nums.length<k)
        	return "No 2";
        
       
        Arrays.sort(nums);
        
    
        return canPartitionKSubsets(nums,sum/k,nums.length-1,new int[k]);
    
    }
	
    public static String canPartitionKSubsets(int a[],int target,int i,int bucket[]){
        
  
        if(i==-1)
            return "Yes 1";
  
        for(int j=0;j<bucket.length;j++){
            

            if(bucket[j]+a[i]<=target){
            

                bucket[j]+=a[i];
                
          
                if(canPartitionKSubsets(a,target,i-1,bucket).equals("Yes 1"))
                    return "Yes 1";
                
      
                bucket[j]-=a[i];
            
            }
            
      
            if(bucket[j]==0)
                break;
        
        }
        
        return "No 2";
    
    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int input1 = 1;
	        int input2 = 1;
	        int[] input3 = {4,1,3,3,1};
	        System.out.println(Solve_Trouble(input1,input2,input3));

	    }

}
