package sets2;

import java.util.HashSet;

public class TestEmpSet2 {

	public static void main(String[] args) {
		// create empty HashSet to store emp type of refs
		HashSet<Emp> emps=new HashSet<>();
		//BBBB AaBB AaAa BBAa
		Emp e1=new Emp("BBBB", "Rama", 1000);
		Emp e2=new Emp("AaBB", "Rohit", 2000);
		Emp e3=new Emp("AaAa", "Meera", 3000);
		Emp e4=new Emp("BBAa", "Raj", 4000);
		Emp e5=new Emp("BBBB", "Rama", 1000);
		Emp e6=new Emp("ABCD", "Sam", 5000);
		
		System.out.println("BBBB".equals("AaBB"));//f
		System.out.println("BBBB".hashCode()+" "+"AaBB".hashCode());//same
		
		System.out.println("Added "+emps.add(e1));//t , hc : 1 eq : 0
		System.out.println("Added "+emps.add(e2));//t , hc : 1 eq : 1
		System.out.println("Added "+emps.add(e3));//t , hc : 1 eq : 2
		System.out.println("Added "+emps.add(e4));//t , hc : 1 eq : 3
		System.out.println("Added "+emps.add(e5));//f , hc : 1 eq : 1
		System.out.println("Added "+emps.add(e6));//t hc :1 eq : 0
		
		System.out.println("size of set "+emps.size());// 5
		System.out.println("Set contents ");
		for(Emp e : emps)
			System.out.println(e);//no dup contents!!!!!!
	


	}

}
