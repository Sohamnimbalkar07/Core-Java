package strings;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		//String class API  
		String s1="Anish";
		String s2="Testing Strings api Here";
		System.out.println(s1.compareTo(s2));
		//display 1st n last char of the string
		System.out.println("1st char "+s2.charAt(0)+" last char "+s2.charAt(s2.length()-1));
		//print yes if s2 contains "API" else print no
		System.out.println(s2.contains("API")?"YES":"NO");
		String s3=new String("Java strings are easier than  in c    ....   ++....");
		System.out.println(s3.indexOf("strings")+" "+s3.lastIndexOf("strings"));
		System.out.println(s2.startsWith("Test"));//t
		System.out.println(s3.endsWith("++"));//f
		String s4="one:two:three:four";
		System.out.println(Arrays.toString(s4.split(":")));
		
	
		
		

	}

}
