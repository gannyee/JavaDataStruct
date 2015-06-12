package com.queue;

public class QueueGame {

	public static void main(String[] args) throws ExceptionQueueFull, ExceptionQueueEmpty {
		// TODO Auto-generated method stub
		String[] kid = {"Alice", "Bob", "Cindy", "Doug", "Ed",
						"Fred", "Gene", "Hope", "Irene", "Jack",
						"Kim", "Lance", "Mike", "Nancy", "Ollie"};
		QueueBuilder qb = new QueueBuilder();
		System.out.println("The luck dog is: " + qb.gameWiner(qb.queueBuild(kid), 5));
	}

	
}
