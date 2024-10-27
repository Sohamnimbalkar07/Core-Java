package p1;
import static p1.Printable.TEST_DATA;

public class Tester2 {

	public static void main(String[] args) {
		ConsolePrinter printer=new ConsolePrinter();
		printer.print("Hello , How r u doing");
		//Can tester(non imple class) acces i/f constant ? YES 
	//	System.out.println("i/f constant "+Printable.TEST_DATA);
		System.out.println("i/f constant "+TEST_DATA);

	}

}
