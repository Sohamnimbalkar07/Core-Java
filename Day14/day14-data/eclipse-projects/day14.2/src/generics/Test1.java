package generics;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		Emp e=new Mgr();
		e.computeSalary();
		ArrayList<Emp> emps=new ArrayList<>();
		ArrayList<Mgr> mgrs=new ArrayList<>();
	//	emps=mgrs;//inheritance in generics DOES NOT work in the same manner as classes
		ArrayList<Object> objs=new ArrayList<>();
	//	objs=emps;
	//	objs=mgrs;
		ArrayList<?> list1=new ArrayList<>();
		list1=emps;
		list1=mgrs;
		list1=objs;
		

	}

}
