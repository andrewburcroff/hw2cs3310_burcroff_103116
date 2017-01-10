package Stack;

import Node.*;

public class Stack {

	private Node current = null;// Setting the current Node to null.
	private int size = 0;// Setting the size.
	
	/*
	 * This method will get the current node.
	 * 
	 * @return the current node
	 */

	public Node getCurrent() {
		return current;// return the current node.
	}

	/*
	 * This method will set the current node to the current.
	 */

	public void setCurrent(Node current) {
		this.current = current;// This line will set the node to the current.
	}

	/*
	 * This method will push an node out of the list.
	 */

	public void push(int data) {
		Node node = new Node(data, getCurrent(), null);// Creating a new node
														// with data, current
														// and null.
		setCurrent(node);// Setting the current node with nodes.
		size++;// Increasing the size one by one.
	}

	/*
	 * This method will pop the current node out of the list.
	 * @return the node without the node that got popped
	 */

	public Node pop(int data) {
		Node node = new Node(data, getCurrent(), null);//Creating a new node.
		if (size == 0) {//If statement if the size is 0.
			System.out.println("Empty Stack");//Printing out the Empty stack.
		} else {
			System.out.println(getCurrent());//Printing the current data.
			node = getCurrent();//Node equals current.
			setCurrent(getCurrent());//Set the current to the get current next data.
		}
		return node;//Return the node.
	}

	/*
	 * This method will find the minimum  Value of stack in the list.
	 */

	public int minValue() {
		
		return 0;
	}

	/*
	 * This method is for the size.
	 * @return the size of the list
	 */

	public int size() {

		return size;// Return the size.
	}
}
