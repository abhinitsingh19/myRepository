package linkedList;

class LinkedList {
	Node head;

	public void push(int i) 
	{
		Node  newNode = new Node(i);
		newNode.next=head;
		head=newNode;
		
	}

	public void printElements() 
	{ 
		Node currentNode = head;
		while(currentNode != null & currentNode.next != null)
		{
			System.out.println(currentNode.data);
			currentNode= currentNode.next;
		}
		
		
	}

	public int lengthOfLinkedList()
	{
		int count =0;
		Node currNode = head;
		while(currNode.next!=null)
		{
			count++;
			currNode=currNode.next;
			
		}
		return count;
		
	}

	public void middleElmentinOnepass() 
	{

		Node slowPointer = head;
		Node fastPointer = head;
		while(fastPointer!=null && fastPointer.next!=null)
		{
			slowPointer = slowPointer.next;
			fastPointer= fastPointer.next.next;
				
		}
			
		System.out.println("Mid element>>"+slowPointer.data);
		
	}

}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

}

public class MiddleElement {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		for (int i = 5; i > 0; --i) {
			l.push(i);

		}

		l.printElements();
		
	System.out.println("length>>"+l.lengthOfLinkedList());
	
	l.middleElmentinOnepass();
	

	}
}
