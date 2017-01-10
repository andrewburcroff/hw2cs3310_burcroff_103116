package Node;

public class Node {

	Node next;//Creating a reference to next.
	Node previous;//Creating a reference to previous.
	int data;//Creating a reference to data.
	int value;//Creating a new value for class.
	
	/*
	 * This is a method where i set my different references.
	 */

	public Node(Object data, Node next, Node previous) 
	{
		next = this.next;//Setting the reference of next to this next.
		data =  this.data;//Setting the reference of data to this data.
		previous = this.previous;//Setting the reference to this previous.
	}

	/*
	 * This method will set the value. 
	 */
	
	public void setValue(int value){
		this.value = value;//Set the value to this this value.
	}
	
	/*
	 * This method will get the value of the node.
	 * @return the node of the value.
	 */
	
	public int getValue(){
		return value;//Return the value.
	}
	
	/*
	 * This method will set the previous pointer to the node minus one
	 * so it can set the value.
	 */
	
	public void setPrevious(Node previous) 
	{
		this.previous = previous;//Allowing the reference to be the previous.
	}
	
	/*
	 * This method will get the previous node.
	 * @return previous node.
	 */
	
	public Node getPrevious() 
	{
		return previous;//Returning the previous node.
	}
	
	/*
	 * This method will get the current data.
	 * @return the data for the current list.
	 */

	public Object getData() 
	{
		return data;//Returning the data nodes.
	}

	/*
	 * This method set the data for the list.
	 */
	
	public void setData(int dataValue)
	{
		data = dataValue;//Setting the data to the current dataValue.
	}

	/*
	 * This method will get the next node.
	 * @return the next node in the list 
	 */
	
	public Node getNext() 
	{
		return next;//Return the next node.
	}

	/*
	 * This method will set the next Node for the list. 
	 */
	
	public void setNext(Node nextValue) 
	{
		next = nextValue;//Setting the next to the next value node.
	}
}
