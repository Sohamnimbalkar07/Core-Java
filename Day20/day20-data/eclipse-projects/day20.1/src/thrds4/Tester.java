package thrds4;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		//create tasks n attach thrd n start the same
		Task2 task2=new Task2();
		Thread t2=new Thread(task2, "t2");//t2 : NEW
		t2.start();
		Task1 task1=new Task1(t2);
		Thread t1=new Thread(task1, "t1");
		t1.start();
		System.out.println("main waiting for the child thrds to complete");
		t1.join();
		t2.join();
		System.out.println("main over....");
	}

}
