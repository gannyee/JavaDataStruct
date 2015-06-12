package com.list.stack;

import com.stack.ExceptionStackEmpty;

public class StackListTest {

	public static void main(String[] args) throws ExceptionStackEmpty {

		//Test Class StackList
		StackList sl = new StackList();
		System.out.println("Size of stack list: " + sl.getSize());
		System.out.println("Is emplty? : " + sl.isEmpty());
		sl.push(12);
		sl.push(13);
		sl.push(15);
		sl.push(17);
		sl.push(2);
		sl.push(6);
		sl.getAllElements();
		System.out.println("Size of stack list: " + sl.getSize());
		System.out.println("Is emplty? : " + sl.isEmpty());
		//sl.getAllElements();
		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println("Size of stack list: " + sl.getSize());
		System.out.println("Is emplty? : " + sl.isEmpty());
		
	}

}
