package test;

public class Test14  {
//	public static int minOs(String s){
//        int count = 0;
//        int first_occurrence = 0;
//        int last_occurrence = 0;
//        int max_len = 0;
//       int final_count=0;
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == '1'){
//                first_occurrence = i;
//                break;
//            }
//        }
//
//        for(int i = s.length() - 1; i >= 0; i--){
//            if(s.charAt(i) == '1'){
//                last_occurrence = i;
//                break;
//            }
//        }
//
//      
//        for(int i = first_occurrence; i <= last_occurrence; i++){
//            if(s.charAt(i) == '1'){
//                max_len++;
//                
//            }
//            else{
//            	if(max_len>final_count) {
//            		final_count=max_len;
//            		max_len=0;
//            	}
//            }
//            
//          
//        }
//      //  System.out.println(remove);
//        return final_count;
//    }
//	
//	public static void main(String[] args) {
//		System.out.println(minOs("0001111111111111001111111100"));
//	}
	
public static void revString(String str) {
		
		char[] ch = str.toCharArray();
        int j = ch.length -1;
        for (int i = 0; i < ch.length/2; i++) {

            if(ch[i] >= 65 && ch[i] <= 122 && ch[j-i]<=122 && ch[j-i]>=65){
                char temp = ch[i];
                ch[i] = ch[j - i];
                ch[j-i] = temp;

            }else{
                j--;
            }
        }

        for(char c : ch){
            System.out.print(c);
        }
	}
	
	public static void main(String[] args) {
		
          String str ="shobh@@it";
          revString(str);
          
	}

}
