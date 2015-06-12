package com.stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack= new Stack();
		System.out.println(stack.getSize());
		System.out.println(stack.isEmpty());
		try {
			stack.push(8);
			stack.push(3);
			stack.push(4);
			stack.push(7);
			stack.push(1);
			stack.push(8);
			stack.push(3);
			stack.push(4);
			stack.push(7);
			stack.push(1);
			System.out.println(stack.getSize());
			System.out.println(stack.top());
			System.out.println(stack.getAllElements());
			
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		} catch (ExceptionStackFull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ExceptionStackEmpty e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
