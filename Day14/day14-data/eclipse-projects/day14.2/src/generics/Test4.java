package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import static generics.GenericUtils.*;

public class Test4 {

	public static void main(String[] args) {
		//AL<Emp>
		ArrayList<Emp> emps=new ArrayList<>();
		emps.add(new Emp());
		emps.add(new Emp());
		emps.add(new Emp());
		invokeComputeSalary(emps);
		//Vector<Worker>
		Vector<Worker> workers=new Vector<>();
		workers.add(new Worker());
		workers.add(new Worker());
		workers.add(new Worker());
		invokeComputeSalary(workers);
		
		

	}

}
