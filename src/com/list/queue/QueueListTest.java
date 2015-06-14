package com.list.queue;

import com.list.stack.ExceptionStackEmpty;

public class QueueListTest {

	public static void main(String[] args) throws ExceptionStackEmpty {
		// TODO Auto-generated method stub
		
		//Declared QueueList example
		QueueList ql = new QueueList();
		
		System.out.println("Size is: " + ql.getSize());
		System.out.println("Is empty? " + ql.isEmpty());
		
		ql.enqueue(12);
		ql.enqueue(32);
		ql.enqueue(35);
		ql.enqueue(12);
		ql.enqueue(34);
		ql.enqueue(45);
		ql.enqueue(17);
		ql.enqueue(2);
		ql.enqueue(15);
		
		System.out.println("Size is: " + ql.getSize());
		System.out.println("Is empty? " + ql.isEmpty());
		ql.getAllElement();
		
		
		for(int i = 0;i < ql.length();i ++)
			System.out.println(ql.dequeue());
		
		
		System.out.println("Size is: " + ql.getSize());
		System.out.println("Is empty? " + ql.isEmpty());
	}

}
