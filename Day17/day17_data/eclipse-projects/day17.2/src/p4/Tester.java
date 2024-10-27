package p4;

import static p4.ComputationUtils.anyOperation;

public class Tester {

	public static void main(String[] args) {
		// no lambda expression pls!
		// display result of addtion of 2 nums
		System.out.println(anyOperation(15, 25, new Computable() {

			@Override
			public double compute(double a, double b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		}));
		// display result of product of 2 nums
		System.out.println(anyOperation(15, 25, new Computable() {

			@Override
			public double compute(double a, double b) {
				// TODO Auto-generated method stub
				return a * b;
			}
		}));
		//Instead of creating entire ano innner class to pass the behaviour , Java 8 onwards : it's possible to pass it directly
		//via lambda expression : divide 2 nums
		//syntax : (args) -> body
		System.out.println(anyOperation(15, 25,(double a, double b) -> {return a/b;}));
		//are there further reductions possible ? YES
		System.out.println(anyOperation(15, 25,(a,b)->a/b));
		//print avg of 2 nums
		System.out.println(anyOperation(15, 25,(a,b)->(a+b)/2));
		

	}

}
