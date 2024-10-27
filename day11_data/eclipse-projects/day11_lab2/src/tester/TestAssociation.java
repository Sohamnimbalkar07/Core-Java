package tester;

import java.util.Date;

import com.app.core.Department;
import com.app.core.Employee;

public class TestAssociation {

	public static void main(String[] args) {
		// Can you create AdharCard instance directly ? NO (composition)
	//	AdharCard card=new AdharCard("fdgfd45645", new Date(), "Mumbai");
		Employee e=new Employee(101, "a1", "b1", "a1@gmail.com", Department.RND, new Date(),12345);
		System.out.println(e);//emp not yet linked with card
		Employee.AdharCard card=e.new AdharCard("fdgfd45645", new Date(), "Mumbai");
		System.out.println(e +""+ card);//emp still  not linked with card
	//	System.out.println(card);
		e.linkAdharCard("abc-45678", new Date(), "Delhi");
		System.out.println(e);
		

	}

}
