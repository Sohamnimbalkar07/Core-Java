package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11 {
//	  public static void main(String[] args) {
//		    // TODO Auto-generated method stub
//		  Scanner sc =new Scanner(System.in);
//		  int n = sc.nextInt();
//		  	int[] arr = new int [n];
//		  	for(int i=0;i<n;i++) {
//		  		arr[i]=sc.nextInt();
//		  		}
//		    //int[] result = new int[arr.length];
//		    ArrayList<Integer> result = new ArrayList<>();
//		    int count = 0;
//		    for(int i = 0; i < arr.length; i++){
//		      for(int j = 0; j < arr.length; j++){
//		        if(arr[i] == arr[j] && i != j){
//		          count++;
//		        }
//		      }
//		      if(count == 0){
//		    	  if(arr[i]!=0)
//		        result.add(arr[i]) ;
//		      }
//		      count = 0;
//		    }
//		   System.out.println(result);
//		  }
	
	  public static void main(String[] args) {
		    String s = "12345078";
		    System.out.println(s);
		    int i = 0;
		    int j = 0;
		    while(i < s.length()){
		      if(s.charAt(i) == '0'){
		        i++;
		      }
		      else{
		        s = s.substring(0,j) + s.charAt(i) + s.substring(j,s.length());
		        i++;
		        j++;
		      }
		    }
		    System.out.println(s);
		  }
}
