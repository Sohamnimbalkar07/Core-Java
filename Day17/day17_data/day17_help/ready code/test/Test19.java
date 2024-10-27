package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Test19 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s= sc.next();
	
	int j=s.length()-1;
	int count1=0;
	int count2=0;
	
	Queue<Integer> q = new LinkedList<>();
	Stack<Integer> st = new Stack<>();
	for(int i=0 ;i<s.length()/2;i++) {
		q.add(Integer.parseInt(s.charAt(i)+""));
	}
for(int i=j ;i<s.length()/2;i--) {
		st.push(Integer.parseInt(s.charAt(i)+""));
	}
while(!st.isEmpty() && count1<s.length()) {
	if(q.peek()==st.peek()) {
		q.poll();
		st.pop();
	}
	else {
		int x = q.poll();
		q.add(x);
		count1++;
		
	}
}
if(count1!=s.length()) {
	while(!q.isEmpty()) {
		q.poll();
		count2++;
	}
	System.out.println(count2);
}
else {
	System.out.println(count2);
}
}
}
