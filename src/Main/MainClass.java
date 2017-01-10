package Main;

import Node.*;
import Queues.*;
import Stack.*;

import java.util.Scanner;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("What would you want to do: Stacks = 1 or Queues = 2 or someting else to quit?");
		@SuppressWarnings("resource")
		// Warning for the Scanner.
		Scanner kb = new Scanner(System.in);// Introducing Scanner to my program.
		int answer = kb.nextInt();// Setting the answer for first question
		while (true) {// Creating a infinite loop
			int data = 1;
			if (answer == 1) {// If the answer is one.
				Stack start = new Stack();// Creating a new stack.
				while (true) {// Creating my 2nd infinite loop.
					System.out.println("Do you want to push 1 or pop =2 or print stack = 3 or somthing else to quit");
					int poporpush = kb.nextInt();// Getting the answer for a pop
													// or push?
					if (poporpush == 1) // If statement for push
					{
						start.push(0);// Perform the push for a stack
					} else if (poporpush == 2) {// if statement for pop.
						start.pop(data);// Perform the pop for a stack
					} else if (poporpush == 3) {
						System.out.println(start);// Printing out the stack.
					} else {
						break;// if something else is entered the break to 1st question.
					}
				}
			}

			else if (answer == 2) {// If answer is 2.
				Queues begin = new Queues();// Creating a new Queue.
				while (true) {
					System.out.println("Do you want to add = 1 or remove =2 or soemthing else to quit");// Asking the user if they want to add or remove.																
					int addorremove = kb.nextInt();// Getting the user answer for question
					if (addorremove == 1) {// if statement for add.
						begin.add(begin);// Perform the add for a queue
					} else if (addorremove == 2) {
						begin.remove(data);// Perform the remove for a queue.
						System.out.println(begin);
					} else {
						break;
					}

				}
			}

			else {
				break;// If something is entered then break to 1st question.
			}
		}
	}

	/*
	 * This method will implement 2 stacks as one queue by using methods pop and
	 * push.
	 */

	public static void stacksToQueue(int data) {
		Node node = new Node(data, null, null);// Setting the node
												// characteristics of node.
		Stack start = new Stack();// Calling the class stack and calling it
									// start.
		Stack end = new Stack();// Calling the class stack and calling it end.
		for (int j = 0; j <= start.size(); j++) {// For loop
			start.push(data);// Push all values into start
			node = start.pop(data);// Pop one from start.
			//end.push(node);// Pushing items to end.
		}
		System.out.println(end);// Writing out end.
	}

	/*
	 * This method will implement 2 stacks as one queue by using methods add and
	 * remove.
	 */

	public static void queueToStack(int data) {
		Node node = new Node(data, null, null);// Setting the node
												// characteristics of node
		Queues start = new Queues();// Calling the stack class and calling it
									// start.
		Queues end = new Queues();// Calling the stack class and calling it end.
		for (int i = 0; i <= start.size(); i++) {// For loop
			start.add(data);// Adds the values into start.
			node = start.remove(data);// Remove the values from start.
			//end.add(node);// Add the items to end.
		}
		System.out.println(end);// Printing/ Writing out end.
	}
	}


