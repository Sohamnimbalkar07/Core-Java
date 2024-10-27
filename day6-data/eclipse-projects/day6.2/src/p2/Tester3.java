package p2;

public class Tester3 {

	public static void main(String[] args) {
		// upcasting
		Printable[] printables = { new NetworkPrinter(), new FilePrinter(), new ConsolePrinter() };// 4 -- array holding
		// i/f type of refs,FP , CP,NP
		for (Printable p : printables) {// p=printables[0]
			p.print("Some Mesg!!!!");// DMD (dynamaic method dispatch)
			if (p instanceof NetworkPrinter)
				((NetworkPrinter) p).encrytData("mesg to be coded");
			else 
				System.out.println("can't encrypt data!!!!!");
		}

	}

}
