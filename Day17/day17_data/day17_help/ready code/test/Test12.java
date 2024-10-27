package test;

public class Test12 {

	static String find(String S,String T,int K ) {
		int diff, n;
		String result="";
		   n=S.length();
		   for(int i=0;i<n;i++){
		      if(S.charAt(i)==T.charAt(i)){
		         continue;
		      }
		      diff=((T.charAt(i)-S.charAt(i))+26)%26;
		      if(diff>K){
		         result="No";
		      }
		      else {
		      result="Yes";
		      }
		      
		   }
		   
		   return result;
	}
	
	public static void main(String[] args) {
		System.out.println(find("abc", "ddd", 3));

	}

}
