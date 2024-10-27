package p1;

public class Tester3 {

	public static void main(String[] args) {
		ConsolePrinter printer=new ConsolePrinter();//direct ref.
		printer.print("Hello , How r u doing");
		Printable reference;//ref type var --i/f type of ref.
		//Can you create instance of the i/f? --NO
		reference=printer;//up casting i/f ref var ---> ANY of it's imple. class instance. : indirect ref.
		reference.print("new mesg!!!!");//JVM invokes : @run time : print() on which instance ---ConsolePrinter
		

	}

}
