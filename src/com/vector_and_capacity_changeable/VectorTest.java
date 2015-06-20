package com.vector_and_capacity_changeable;

/**
 * Test
 * @author gannyee
 *
 */
public class VectorTest {

	public static void main(String[] args) throws ExceptionBoundaryExceed {
		
		//Define VectorBasicOnArrat class
		VectorBasicOnArrays vba = new VectorBasicOnArrays();
		
		System.out.println("Size: " + vba.getSize());
		System.out.println("Is empty? " + vba.isEmpty());
		
		vba.insertAtRank(0, 1);
		vba.insertAtRank(1, 2);
		vba.insertAtRank(2, 3);
		vba.insertAtRank(3, 4);
		vba.insertAtRank(4, 5);
		vba.insertAtRank(5, 6);
		vba.insertAtRank(5, 7);
		vba.insertAtRank(6, 8);
		System.out.println("Size: " + vba.getSize());
		System.out.println("Is empty? " + vba.isEmpty());
		vba.getAllelements();
		
		vba.replaceAtRank(0, 12);
		vba.replaceAtRank(1, 13);
		vba.replaceAtRank(2, 14);
		vba.replaceAtRank(3, 15);
		System.out.println("Size: " + vba.getSize());
		System.out.println("Is empty? " + vba.isEmpty());
		vba.getAllelements();
		
		vba.removeAtRank(7);
		vba.removeAtRank(5);
		vba.removeAtRank(4);
		vba.removeAtRank(1);
		vba.removeAtRank(0);
		System.out.println("Size: " + vba.getSize());
		System.out.println("Is empty? " + vba.isEmpty());
		vba.getAllelements();
	}

}
