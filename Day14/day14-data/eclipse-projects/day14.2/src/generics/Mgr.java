package generics;

public class Mgr extends Emp {
	@Override
	public double computeSalary() {
		System.out.println("in mgr's comp sal");
		return 2;
	}
}
