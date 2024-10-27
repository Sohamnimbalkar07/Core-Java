package runnable_tasks;

import com.app.core.JointAccount;

public class UpdaterTask implements Runnable {
	// state
	private JointAccount jointAccount;

	public UpdaterTask(JointAccount jointAccount) {
		this.jointAccount = jointAccount;// for sharing of the resources between 2 customers
		System.out.println("in ctor : by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while (true) {
				synchronized (jointAccount) {
					jointAccount.updateBalance(1000);
					Thread.sleep(43);// sleeping thrd sleeps inside the monitor (Thread which is blocked sleep, will
										// not release the ownership of the monitor : degrades the performance
				}

			}
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + " err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
