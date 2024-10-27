package com.app.tester;

import java.util.Scanner;

import com.app.core.Box;

/*
 * Objective : Ask user(client) , how many boxes to make ?
 * Accept Box dims
    Store these details suitably.
1. Display using single for-each loop, box dims n volume
 */
public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many boxes pls ?");
		// create array type of the ref.
		Box[] boxes;// boxes : local var(mem allocated on stack : no of bytes as per JVM specs) , un
					// inited
		// create Box[] : array type of object , that can hold Box type of refs.
		boxes = new Box[sc.nextInt()];// 4 , [L com.app.Box class : Box[] class loaded in method area ---> array
										// object created in heap
		// ---> CP, length=4 , 4 nulls
		System.out.println("Name of the Box[] class " + boxes.getClass());
		// display default array contents : for-each
		System.out.println("def array contents ");
		for (Box b : boxes)
			System.out.println(b);
		// Accept Box dims from user ---> create box class instance --> add the ref of
		// this box object into the array
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter Box dims - w d h");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		//Display using single for-each loop, box dims n volume
		for (Box b : boxes) //b=boxes[0],b=boxes[1].....b=boxes[boxes.length-1]
		{
			System.out.println(b.getBoxDimensions());
			System.out.println("Volume "+b.getBoxVolume());
		}
		
		sc.close();

	}

}
