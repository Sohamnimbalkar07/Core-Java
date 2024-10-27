package var_args;

public class Test {

	public static void main(String args[]) {
		System.out.println("Testing no-args");
		displayNames();//no args
		System.out.println("Testing with Animal[]");
		Animal[] pets= {new Cat("Mojo"),new Dog("Casper"),new Horse("Speedy")};
		displayNames(pets);
		System.out.println("Testing with , separated animals");
		displayNames(new Dog("Bruno"),new Horse("SeaBiscuit"));
		
	}

	// add a static method which accept var no of args n displays the name
	private static void displayNames(Animal... animals) {
		for (Animal a : animals)
			System.out.println(a.getName());
	}

}
