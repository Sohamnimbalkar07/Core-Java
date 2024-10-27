package strings;

public class Test5 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println("length " + sb1.length() + " capa " + sb1.capacity());// 5 21
		sb1.append(true);
		sb1.append(123.45);
		StringBuilder sb2 = sb1.append(345673452464l);
		System.out.println(sb1);// sb1.toString : hellotrue123.4534567
		System.out.println(sb2);// hellotrue123.4534567
		System.out.println(sb1 == sb2);// t
		System.out.println("length " + sb1.length() + " capa " + sb1.capacity());
		sb1.insert(2, 99999);// he99999llotrue123.4534567
		System.out.println(sb2);
		sb2.delete(1, 4);// h999llotrue123.4534567
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);// reversed contents
		StringBuilder sb3 = new StringBuilder("testing 123");
		StringBuilder sb4 = new StringBuilder("testing 123");
		System.out.println(sb3 == sb4);// false : based upon ref equality
		System.out.println(sb3.equals(sb4));// false : based upon ref equality (since SB class HAS NOT OVERRIDDEN equals
											// method)

	}

}
