
public class Customer  {
	
	//data members
	private int custId,cellno;
	private static final double bonus=10000;//instance variable
	private String fname,lname;
	//private double totalBill;
	private static double discount;//single copy:shared by all object
	private static int counter=100;
	static {
		//only for static data members
		System.out.println("------static block-------");
		discount=50;
	}
	
	//constr
	//initialization of data members

	public Customer(String fname,String lname,int cellno)
	{
		
		//how to auto increment custid
		this.fname=fname;
		this.lname=lname;
		this.cellno=cellno;
		
		this.custId=counter;//101
		counter=counter+1;//102
		
		
	}
	
	public void displayCust()
	{//static we can access in non static
	    //bonus=50000;
		System.out.println(custId+"   "+fname+"   "+lname+"   "+cellno+"  "+discount+"  "+bonus);
		
	}
	
	public static double getDisscount()
	{
		//can we access non static/instance variable in static methohd:NO
		//this is never passed to static methods
		//this.custId=10;
		return discount;//
		
	}
	
	
}
