package tester;
import java.util.ArrayList;

import com.app.core.Employee;
import com.app.core.Manager;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Manager> mgr = new ArrayList<>();
		mgr.add(new Manager());
		mgr.add(new Manager());
		mgr.add(new Manager());
		ArrayList<Employee> list = new ArrayList<>(mgr);
        System.out.println(list);
	}

}
