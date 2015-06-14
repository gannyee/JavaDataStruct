package com.doub.list;

import com.queue.ExceptionQueueEmpty;

/**
 * 
 * @author gannyee
 *
 */
public class DoubleListQueueTest {

	public static void main(String[] args) throws ExceptionQueueEmpty {
		DoubleListQueue dlq = new DoubleListQueue();
		
		System.out.println("Size: " + dlq.getSize());
		System.out.println("Is empty? " + dlq.isEmpty());
		
		for(int i = 0;i < 6;i ++){
			dlq.insertFirst(i);
		}
		
		System.out.println("Size: " + dlq.getSize());
		System.out.println("Is empty? " + dlq.isEmpty());
		dlq.getAllElements();
		System.out.println(dlq.getFirst());
		System.out.println(dlq.getLast());
		
		for(int i = 0;i < 6;i ++){
			dlq.insertLast(i + 1);
		}
		
		System.out.println("Size: " + dlq.getSize());
		System.out.println("Is empty? " + dlq.isEmpty());
		dlq.getAllElements();
		System.out.println(dlq.getFirst());
		System.out.println(dlq.getLast());
		
		for(int i = 0;i < 6;i ++){
			dlq.removeFirst();
		}

		System.out.println("Size: " + dlq.getSize());
		System.out.println("Is empty? " + dlq.isEmpty());
		dlq.getAllElements();
		System.out.println(dlq.getFirst());
		System.out.println(dlq.getLast());
		
		for(int i = 0;i < 6;i ++){
			dlq.removeLast();
		}

		System.out.println("Size: " + dlq.getSize());
		System.out.println("Is empty? " + dlq.isEmpty());
		dlq.getAllElements();
	}

}
