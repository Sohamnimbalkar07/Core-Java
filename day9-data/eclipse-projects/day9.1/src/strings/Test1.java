package strings;

public class Test1 {

	public static void main(String[] args) {
		// testing immutability of the strings
		String s1=new String("hello");
		String s2=s1.concat("hi!");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		s1 += "12345";//s1=s1+"12345";
		System.out.println("s1 = "+s1);
		System.out.println(s2.toUpperCase());//upper cased : HELLOHI!
		System.out.println("s2 = "+s2);//lower cased
		//replace all occurrences of 'l' in s2 by 't'
		String s3=s2.replace('l', 't');
		System.out.println("s2 = "+s2);//orig string 
		System.out.println("s3 = "+s3);// replaced string

	}

}
