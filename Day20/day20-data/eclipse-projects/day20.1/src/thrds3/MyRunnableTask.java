package thrds3;
import static java.lang.Thread.*;

public class MyRunnableTask implements Runnable {


	@Override
	public void run() /* throws InterruptedException */ {
		System.out.println(currentThread().getName() + " strted");//RUNNING
		try {
			// B.L : for loop
			for (int i = 0; i < 10; i++) {
				System.out.println(currentThread().getName() + " exec # " + i);
				Thread.sleep(500);//BLOCKED on sleep
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " err " + e);
		}
		System.out.println(currentThread().getName() + " over");
	}

}
