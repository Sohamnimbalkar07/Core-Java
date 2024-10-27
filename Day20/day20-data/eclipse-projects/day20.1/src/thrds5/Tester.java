package thrds5;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		//create tasks n attach thrd n start the same
		Task2 task2=new Task2();
		Thread t2=new Thread(task2, "t2");//t2 : NEW
		t2.start();
		Task1 task1=new Task1(t2);
		Thread t1=new Thread(task1, "t1");
		t1.start();
		System.out.println("main waiting patiently for some time for  t1 to complete");
		t1.join(3000);
		//=>Which option is correct ? 1.  t1 over or 2. tmout elapsed :Ans  tmout elapsed.
		System.out.println("t1 : "+t1.isAlive());//t
		System.out.println("main sending interrupt signal to t2 ");
		t2.interrupt();
		System.out.println("main waiting for child thrds to finish exec");
		t1.join();
		t2.join();
		
		
		System.out.println("main over....");
	}

}
