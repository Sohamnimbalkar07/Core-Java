package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class TestIntegerList {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create empty AL for storing integer type of refs.
			ArrayList<Integer> list = new ArrayList<>();
			// size = 0 , capa =10
			// add 10,20,30,40,50 : in the list
			for (int i = 1; i < 6; i++)
				list.add(i * 10);// auto boxing
			System.out.println(list);// toString of AL
			list.add(20);
			System.out.println(list);
			list.add(20);
			System.out.println(list);
			list.add(null);// appends null ref to the end of the list
			list.add(0, null);// inserts null ref to the beginning of the list
			System.out.println(list);
			System.out.println("size " + list.size());
			// display Present if the list contains specified elem o.w print Absent
			System.out.println("Enter the elem to search");
			System.out.println(list.contains(sc.nextInt())?"Present":"Absent");
			
		}

	}

}
