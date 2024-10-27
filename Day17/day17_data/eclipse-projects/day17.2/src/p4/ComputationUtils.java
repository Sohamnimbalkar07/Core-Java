package p4;

/*
 * 1.2 Create an i/f : ComputationUtils :  to add a static method
to return  result of  ANY operation performed on 2 double operands

 */
public interface ComputationUtils {
	static double anyOperation(double a1,double b1,Computable operation)
	{
		return operation.compute(a1, b1);
	}
}
