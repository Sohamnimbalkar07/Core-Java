package lists;

import java.util.ArrayList;


public class TestIntegerList {

public static void main(String[] args) {
		
ArrayList<Integer> list = new ArrayList<>();
for(int i = 1;i<6;i++)
{
	list.add(i*5);
}

System.out.println(list);
list.add(0,null);
list.add(2,4);
list.add(3,5);
System.out.println(list);
System.out.println(list.size());

System.out.println(list.contains(45));
}

}
