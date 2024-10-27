package tester;

import com.app.core.JointAccount;

import runnable_tasks.CheckBalanceTask;
import runnable_tasks.UpdaterTask;

public class TestSharedResources {

	public static void main(String[] args) throws InterruptedException {
		// create SINGLETON instance of the joint a/c
		JointAccount account=new JointAccount(5000);
		//create tasks , attach tasks to thrds , start the same
		//Thread(Runnable task,String name)
		Thread t1=new Thread(new UpdaterTask(account), "cust1");
		Thread t2=new Thread(new CheckBalanceTask(account), "cust2");
		t1.start();
		t2.start();
		System.out.println("main waiting for child thrds...");
		t1.join();
		t2.join();
		System.out.println("main over....");
		

	}

}
