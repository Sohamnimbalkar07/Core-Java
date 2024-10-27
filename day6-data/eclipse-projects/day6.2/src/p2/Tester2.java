package p2;

public class Tester2 {

	public static void main(String[] args) {
		//upcasting
		Printable[] printables = { new FilePrinter(), new ConsolePrinter(), new NetworkPrinter() };// 4 -- array holding
		// i/f type of refs,FP , CP,NP
		for (Printable p : printables)//p=printables[0]
			p.print("Some Mesg!!!!");//DMD (dynamaic method dispatch)

	}

}
