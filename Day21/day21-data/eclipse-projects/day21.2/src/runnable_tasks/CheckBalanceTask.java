package runnable_tasks;

import com.app.core.JointAccount;

public class CheckBalanceTask implements Runnable {
	// state
	private JointAccount jointAccount;

	public CheckBalanceTask(JointAccount jointAccount) {
		this.jointAccount = jointAccount;// for sharing of the resources between 2 customers
		System.out.println("in ctor : by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while(true)
			{
				double balance = jointAccount.checkBalance();
				if(balance != 5000) {
					//un expected scenario
					System.out.println("INVALID BALANCE !!!!!!!!!!!!!!!!!!");
					System.exit(-1);//terminate JVM
					
				}				
		//		Thread.sleep(31);
			}
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + " err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
