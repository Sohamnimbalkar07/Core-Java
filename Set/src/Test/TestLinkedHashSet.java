package Test;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		
			LinkedHashSet<Integer> intset = new LinkedHashSet<>();
		int[] data = {6,4,7,3,1,9,5,7};
		for(int i : data)
		{
			intset.add(i);
		}
System.out.println(intset);
	}

}
