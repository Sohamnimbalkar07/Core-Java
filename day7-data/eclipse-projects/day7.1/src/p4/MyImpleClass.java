package p4;

public class MyImpleClass implements A,B{

	@Override
	public void show() {
		System.out.println("in show "+A.DATA+" "+B.DATA);
		
	}

}
