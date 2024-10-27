package sets2;

import java.util.HashSet;

public class TestEmpSet {

	public static void main(String[] args) {
		// create empty HashSet to store emp type of refs
		HashSet<Emp> emps=new HashSet<>();
		Emp e1=new Emp("rnd-001", "Rama", 1000);
		Emp e2=new Emp("rnd-008", "Rohit", 2000);
		Emp e3=new Emp("rnd-007", "Meera", 3000);
		Emp e4=new Emp("rnd-001", "Rama", 1000);
		Emp e5=new Emp("rnd-003", "Rama", 1000);
		Emp e6=new Emp("rnd-005", "Rama", 1000);
		System.out.println("Added "+emps.add(e1));//t : hc : 
		System.out.println("Added "+emps.add(e2));//t : hc , eq : 1
		System.out.println("Added "+emps.add(e3));//t : hc , eq : 2
		System.out.println("Added "+emps.add(e4));//f : hc , eq : 1
		System.out.println("Added "+emps.add(e5));//t : hc , eq  : 3
		System.out.println("Added "+emps.add(e6));//t : hc , eq  : 4
		System.out.println("size of set "+emps.size());// 5
		System.out.println("Set contents ");
		for(Emp e : emps)
			System.out.println(e);//no dup contents!!!!!!
	


	}

}
