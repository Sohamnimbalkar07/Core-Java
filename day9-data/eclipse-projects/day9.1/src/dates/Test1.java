package dates;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Date d1=new Date();//current date n time
		Date d2=new Date(10000);//10000 msec elapsed after epoch(1st Jan 1970) 
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.before(d2));//false
		System.out.println(d1.after(d2));//true
		System.out.println(d1.compareTo(d2));//>0 / 0 / < 0

	}

}
