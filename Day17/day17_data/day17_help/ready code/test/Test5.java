package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5 {
public static void main(String[] args) {
	int[] a = { 5, 20, 10, 2, 1, 9, 8 };
    int n = 3;
    int max = a[0], min = a[0];
    for (int i = 0; i < a.length; i++) {
        if (a[i] < min) {
            min = a[i];
        }
        if (a[i] > max) {
            max = a[i];
        }

    }

    int max1 = max, c = 0;
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            if (a[j] > min && a[j] < max) {
                max = a[j];
            }
        }
        min = max;
        max = max1;
        c++;
        if (c == (a.length - n)) {
            System.out.println(min);
        }
    }
	
//	Double a = 1.0;
//	Double b = 0.0;
//	Double c = a/b;
//	System.out.println(c);
	
//	   String str=new String("KanaditsKanad");
//
//       System.out.println(repeatedChar(str));
}


    public static String repeatedChar(String str) {

        char [] arr = str.toCharArray();
        Arrays.sort(arr);
       String str1 ="";
        for(int i=0 ; i<arr.length-1 ; i++) {

            if(arr[i] == arr[i+1] ) {
                if(str1.indexOf(arr[i]) < 0) {
                    str1+=arr[i];
                }
            }
        }


        return str1;
    }
}
