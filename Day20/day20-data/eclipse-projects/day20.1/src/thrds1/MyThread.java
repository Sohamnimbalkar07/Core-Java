package thrds1;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);// state : NEW
		start();// RUNNABLE
	}

	@Override
	public void run() /* throws InterruptedException */ {
		System.out.println(getName() + " strted");//RUNNING
		try {
			// B.L : for loop
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + " exec # " + i);
				Thread.sleep(500);//BLOCKED on sleep
			}
		} catch (Exception e) {
			System.out.println(getName() + " err " + e);
		}
		System.out.println(getName() + " over");
	}

}
