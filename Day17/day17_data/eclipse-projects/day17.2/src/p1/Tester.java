package p1;

public class Tester {

	public static void main(String[] args) {
		Formula[] formulae= {new MyFormula(),new AnotherFormula()};//up casting
		for(Formula f : formulae)
		{
			f.calculate(10);
			f.sqrt(15, 10);
		}

	}

}
