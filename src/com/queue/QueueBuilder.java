package com.queue;

public class QueueBuilder {

	// Building string type array for queue
	public static Queue queueBuild(String[] str) {
		Queue queue = new Queue();

		for (int i = 0; i < str.length; i++) {
			try {
				queue.enqueue(str[i]);
			} catch (ExceptionQueueFull e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return queue;
	}

	// Weed out the kth kid who get the sweet potato
	public static String gameWiner(Queue queue, int k)
			throws ExceptionQueueFull, ExceptionQueueEmpty {

		if (queue.isEmpty())
			return null;
		while (queue.getSize() > 1) {
			queue.getAllElements();// output recently queue
			for (int i = 0; i < k - 1; i++)
				queue.enqueue(queue.dequeue());
			System.out.println("\n\t" + queue.dequeue() + ": weep out");
		}
		return (String) queue.dequeue();
	}
}
