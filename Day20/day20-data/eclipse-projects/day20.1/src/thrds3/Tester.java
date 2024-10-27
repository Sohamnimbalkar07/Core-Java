package thrds3;
import static java.lang.Thread.*;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main thrd's details "+currentThread());//Thread[main,5,main]
		//1 main thread
		//parent thrd : main will be used to created child thrds
		//create instance of the runnable task n attach it the the thread
		MyRunnableTask task=new MyRunnableTask();
		//Thread(Ruunable instance,String name)
		Thread t1=new Thread(task,"one");//one : NEW
		Thread t2=new Thread(task,"two");
		Thread t3=new Thread(task,"three");
		Thread t4=new Thread(task,"four");//four : NEW, how many RUNNABLE thrds : 1
		t1.start();
		t2.start();
		t3.start();
		t4.start();//how many RUNNABLE thrds : 5
		
		//delay loop to simulate main's B.L 
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName() + " exec # " + i);
			Thread.sleep(200);//BLOCKED on sleep
		}
	//	t1.start();//main thrd gets exc : IllegalThreadStateExc (dead thrd can't be restarted!)
		System.out.println(t1.isAlive()+" "+t4.isAlive());//t t
		System.out.println("main waiting for child thrds to complete exec : to ensure no orphans");
		t1.join();//main waiting for t1 to complete exec : Blocked on joint1.join();//main waiting for t1 to complete exec : Blocked on join
		t2.join();//main waiting for t2 to complete exec : Blocked on join
		t3.join();//main waiting for t3 to complete exec : Blocked on join
		t4.join();//main waiting for t3 to complete exec : Blocked on join
		System.out.println(t1.isAlive()+" "+t4.isAlive());//f f
		System.out.println("main over....");
		
		

	}

}
