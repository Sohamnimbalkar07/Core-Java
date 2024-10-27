package itc_with_wait;

//mutable BUT inherently thread safe : since all APIs are synched
public class Utils2 {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());
		while (dataReady)
			wait();//p : blocked on wait  : outside the monitor
		// produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());
		dataReady=true;

	}

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());
		while(!dataReady)
			wait();
		// consume data
		System.out.println("Read  Data " + e);
		
		System.out.println("r exited --- " + Thread.currentThread().getName());
		dataReady=false;
		return e;
	}

}
