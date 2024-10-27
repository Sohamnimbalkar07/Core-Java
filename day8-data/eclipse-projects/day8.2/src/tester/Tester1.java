package tester;

public class Tester1 {

	public static void main(String[] args) {
		try {
			System.out.println("in main");
			int c = 100 / 0;// AE (throw new AE(....))
			System.out.println("result " + c);
			String s = "a1234";
			System.out.println("parsed int value " + Integer.parseInt(s));// NFE
			s = "hello";
			System.out.println("char at 0th index " + s.charAt(0));// NPE
			int[] data = { 1, 2, 3, 4, 5 };
			System.out.println("array data " + data[5]);// AOB
			System.out.println("end of try");
//		} catch (ArithmeticException e) {
//			System.out.println("1");
//		} catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) {
//			System.out.println("2");
		} catch (Exception e) {
			System.out.println("in catch-all");
		//	System.out.println(e.getMessage());//detailed err mesg
		//	System.out.println(e);//e.toString
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
