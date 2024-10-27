package generics;

public class Worker extends Emp {
	@Override
	public double computeSalary() {
		System.out.println("in worker's comp sal");
		return 3;
	}
}
