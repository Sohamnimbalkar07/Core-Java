package test_enum;

public enum Department {
//typically enums have : set of related constants
	RND,FINANCE,MARKETING,HR,PRODUCTION;
	//can you override toString method in your enum ? YES
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
