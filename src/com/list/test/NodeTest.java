package com.list.test;

import com.stack.ExceptionStackEmpty;

/**
 * 
 * @author gannyee
 *
 */
public class NodeTest {
	
	public static void main(String[] args) throws ExceptionStackEmpty, ExceptionNodeListEmpty {
		//Test AddAddElementByFirst() function and AddElementByLast() function
		NodeList nodeList = new NodeList();
		nodeList.AddElementByFirst("1");
		nodeList.AddElementByFirst("2");
		nodeList.AddElementByFirst("3");
		nodeList.AddElementByFirst("4");
		nodeList.AddElementByFirst("5");
		nodeList.AddElementByFirst("6");
		nodeList.AddElementByLast("8");
		nodeList.AddElementByLast(9);
		nodeList.AddElementByLast("10");
		nodeList.AddElementByLast(11);
		
		System.out.println("--------------------------------");
		
		//Test ModifyElement() function
		nodeList.ModifyElement("6","32");
		nodeList.ModifyElement("12","34");
		
		System.out.println("--------------------------------");
		
		//Test isInNodeList() function
		nodeList.isInNodeList("7");
		nodeList.isInNodeList("9");
		nodeList.isInNodeList(11);
		nodeList.isInNodeList(2);
		
		System.out.println("--------------------------------");
		//Test getAllElements() function and getSize() function
		nodeList.getAllElements();
		System.out.println("size: " + nodeList.getSize());
		
		System.out.println("--------------------------------");
		
		//Test DeleteNodeInCenter() function
		nodeList.DeleteNodeInCenter(9);
		nodeList.getAllElements();
		System.out.println("size: " + nodeList.getSize());
		
		System.out.println("--------------------------------");
		//Test DeleteElementByLast() function and DeleteElementByFirst() function
		nodeList.DeleteElementByLast();
		nodeList.getAllElements();
		System.out.println("size: " + nodeList.getSize());
		
		System.out.println("--------------------------------");
		nodeList.DeleteElementByLast();
		nodeList.getAllElements();
		System.out.println("size: " + nodeList.getSize());
		
		System.out.println("--------------------------------");
		nodeList.DeleteElementByLast();
		nodeList.getAllElements();
		System.out.println("size: " + nodeList.getSize());
		
		System.out.println("--------------------------------");
		nodeList.DeleteElementByFirst();
		nodeList.getAllElements();
		System.out.println("size: " + nodeList.getSize());
		
		System.out.println("--------------------------------");
		//Test AddElementAfterNode() function
		nodeList.AddElementAfterNode("4", "65");
		nodeList.getAllElements();
		System.out.println("size: " + nodeList.getSize());
		
		System.out.println("--------------------------------");
		nodeList.AddElementAfterNode("22", "65");
		nodeList.getAllElements();
		System.out.println("size: " + nodeList.getSize());
		
		nodeList.AddElementByLast("12");
		nodeList.AddElementByLast("13");
		nodeList.AddElementByLast("14");
		nodeList.AddElementByLast("15");
		nodeList.AddElementByLast("16");
		nodeList.AddElementByLast("17");
		nodeList.AddElementByLast("18");
		nodeList.getAllElements();
		System.out.println("size: " + nodeList.getSize());
	}
}
