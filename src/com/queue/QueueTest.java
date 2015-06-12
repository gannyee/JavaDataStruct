package com.queue;
/**
 * QueueTest
 * @author gannyee
 *
 */
public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue();
		System.out.println("The size of queue is: " + queue.getSize());
		System.out.println("Is empty: " + queue.isEmpty());
		try {
			queue.enqueue(8);
			queue.enqueue(3);
			queue.enqueue(5);
			queue.enqueue(7);
			queue.enqueue(9);
			queue.getAllElements();
			System.out.println("The size of queue is: " + queue.getSize());
			System.out.println("Is empty: " + queue.isEmpty());
			System.out.println("The front element of queue: "
					+ queue.frontElement());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println("The size of queue is: " + queue.getSize());
			System.out.println("Is empty: " + queue.isEmpty());
		} catch (ExceptionQueueFull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExceptionQueueEmpty e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
