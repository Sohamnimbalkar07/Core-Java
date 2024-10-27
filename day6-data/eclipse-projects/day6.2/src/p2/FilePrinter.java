package p2;

public  class FilePrinter implements Printable{
//MUST implement , inherited abstract functionality
	@Override
	public void print(String mesg)
	{
		System.out.println("Storing "+mesg+" in the file ");
		
	}
	
}
