package overriding;

public class OverRiding {

	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	
	
	int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	
	void sum(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	
	
	public static void main(String[] args) {
		
		OverRiding o = new OverRiding();
		int a=o.sum(5,6,7);
		System.out.println(a);

	}

}
