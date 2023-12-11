package tester;

public class TestUncheckedException {

	public static void main(String[] args) {
		
		try {
			System.out.println("in main");
			int[] data = {1,2,3,4,5};
			System.out.println(data[6]);
			
			Thread.sleep(5000);
			System.out.println("in main ends");
		}
		catch(InterruptedException e) 
		   { 
			System.out.println("error2"); 
		   }
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error1");
			//e.printStackTrace();
		}
		
		 
		 
		finally
		{
			System.out.println("main over");
		}
		System.out.println("main over1");
	}

}
