package no_itc;
//mutable BUT inherently thread safe : since all APIs are synched
public class Utils2 {
	private Emp e;
	public synchronized void writeData(Emp ref) throws Exception {
		 System.out.println("w entered --- "+Thread.currentThread().getName());
		 Thread.sleep(300);
		//produce data
		e = ref;
		System.out.println("Write Data " +e);
		 System.out.println("w exited --- "+Thread.currentThread().getName());
	
	}

	public synchronized Emp readData() throws Exception {
		 System.out.println("r entered --- "+Thread.currentThread().getName());
		//consume data
		System.out.println("Read  Data " + e);
		Thread.sleep(10);
		 System.out.println("r exited --- "+Thread.currentThread().getName());
	
		return e;
	}

}
