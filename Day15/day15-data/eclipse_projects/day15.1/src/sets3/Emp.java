package sets3;

//PK : id n salary => composite PK (i.e 2 emps are same iff id n salary is same!)
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
		if(o instanceof Emp) {
			Emp e=(Emp) o;
			return id.equals(e.id) && salary == e.salary;
		}
		return false;
	}
	//add overriding form of hashCode to follow the MANDATORY part of the contract
	@Override
	public int hashCode()
	{
		System.out.println("in hashCode");
		int result=(int) (id.hashCode() + salary);
		return result;
	}
//	@Override
//	public int hashCode() {
//		System.out.println("in hashCode");
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(salary);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("in eq");
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Emp other = (Emp) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
//			return false;
//		return true;
//	}
	

}
