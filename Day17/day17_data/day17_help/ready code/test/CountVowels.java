package test;

public class CountVowels {

	static void countAndDeleteVowels(String line1) {
		String line = line1.toLowerCase();
		char[] str = line.toCharArray();
		StringBuilder s= new StringBuilder();
		int count=0;
		for (int i=0 ; i<str.length;i++) {
			if(str[i]=='a' || str[i]=='e'|| str[i]=='i'|| str[i]=='o'|| str[i]=='u') {
				count++;
			}
			else {
				
				s.append(str[i]);
			}
		}
		
		System.out.println(s);
		System.out.println("No of vowels in oriinal string  :- "+count);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is aniket jain second coupa interview";
		
		countAndDeleteVowels(s);
	}

}
