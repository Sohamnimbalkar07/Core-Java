package sets;

public class Emp {
	private String id;
	private String name;
	private double salary;
	public Emp(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}	
	//add overriding form of equals : based on id
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp equals");
		if(o instanceof Emp)
			return id.equals(((Emp)o).id);
		return false;
	}
	//add overriding form of hashCode to follow the MANDATORY part of the contract
	@Override
	public int hashCode()
	{
		System.out.println("in hashCode");
		return 100;
	}
	

}
