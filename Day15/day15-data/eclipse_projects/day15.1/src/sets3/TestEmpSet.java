package sets3;

import java.util.HashSet;

public class TestEmpSet {

	public static void main(String[] args) {
		// create empty HashSet to store emp type of refs
		HashSet<Emp> emps=new HashSet<>();
		Emp e1=new Emp("rnd-001", "Rama", 1000);
		Emp e2=new Emp("rnd-008", "Rohit", 1000);
		Emp e3=new Emp("rnd-001", "Meera", 3000);
		Emp e4=new Emp("rnd-001", "Rama", 1000);
		Emp e5=new Emp("rnd-003", "Rama", 5000);
	
		System.out.println("Added "+emps.add(e1));//t
		System.out.println("Added "+emps.add(e2));//t
		System.out.println("Added "+emps.add(e3));//t
		System.out.println("Added "+emps.add(e4));//f
		System.out.println("Added "+emps.add(e5));//t
		
		System.out.println("size of set "+emps.size());// 5
		System.out.println("Set contents ");
		for(Emp e : emps)
			System.out.println(e);//no dup contents!!!!!!
	


	}

}
