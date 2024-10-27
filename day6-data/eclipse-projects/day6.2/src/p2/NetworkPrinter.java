package p2;

public  class NetworkPrinter implements Printable{
//MUST implement , inherited abstract functionality
	@Override
	public void print(String mesg)
	{
		System.out.println("Sending  "+mesg+" from client --> server");
		
	}
//	@Override
	public void encrytData(String mesg)
	{
		System.out.println("Encrypting the mesg : "+mesg);
	}
	
}
