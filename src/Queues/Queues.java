package Queues;

import Node.*;

public class Queues {

	private Node current = null;// Setting the preference of the current equalto null.
	private int size = 0;// Setting the preference of the size to 0.
	private Node memory = null;// Setting the preference of the Node memory to null.
	
	/*
	 * This method will get the Memory.
	 * @return the memory for the list.
	 */
	public Node getMemory() {
		return memory;// Return the memory.
	}

	/*
	 * This method will set the Memory.
	 */

	public void setMemory(Node memory) {
		this.memory = memory;// Setting this memory to the reference memory.
	}

	/*
	 * This method will get the current node.
	 * 
	 * @return the current node for Queues.
	 */

	public Node getCurrent() {
		return current;// Returning the current node.
	}

	/*
	 * This method will set the current to node.
	 */

	public void setCurrent(Node current) {
		this.current = current;// Setting the current node
	}

	/*
	 * This method will add to the node to the list.
	 */

	public void add(Object data) {
		Node node = new Node(data, null, getMemory());// Creating a new node
														// with data, null, and
														// getMemory function.
		if (getMemory() == null)// If statement saying if Memory is null.
		{
			setCurrent(node);// Calling the set current to the node.
		}
		setMemory(node);// Set the memory to the node.
		size++;// Increasing the size one by one.
	}

	/*
	 * This method will remove a certain node in the list.
	 */

	public Node remove(int data) {
		if (size == 0) // If statement is size is equal to 0
		{
			System.out.println("Empty Queue");// System prints out the line to
												// be empty.
		} else {
			System.out.println(getCurrent());// Printing the current data.
			setCurrent(getCurrent());// Sets the current data to the previous.
		}
		return current;//Return the current.
	}

	/*
	 * This method will return the size of the list in Queues.
	 * @return the size
	 */

	public int size() {

		return size;// Return the size.
	}
}
