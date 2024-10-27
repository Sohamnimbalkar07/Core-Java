package thrds1;
import static java.lang.Thread.*;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main thrd's details "+currentThread());//Thread[main,5,main]
		//1 main thread
		//parent thrd : main will be used to created child thrds
		MyThread t1=new MyThread("one");
		//t1.start();
		MyThread t2=new MyThread("two");
		MyThread t3=new MyThread("three");
		MyThread t4=new MyThread("four");//1 + 4 child thrds
		//delay loop to simulate main's B.L 
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName() + " exec # " + i);
			Thread.sleep(1000);//BLOCKED on sleep
		}
	//	t1.start();//main thrd gets exc : IllegalThreadStateExc (dead thrd can't be restarted!)
		System.out.println(t1.isAlive()+" "+t4.isAlive());//f f
		System.out.println("main over....");
		
		

	}

}
