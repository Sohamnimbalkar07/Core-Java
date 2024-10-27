package thrds4;

public class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		int counter = 0;
		try {
			while (true) {
				System.out.println(Thread.currentThread().getName() + " exec " + (counter++));
				Thread.sleep(300);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
