package question2_3;

import question2_2.Node;
import question2_2.LinkedListNode;

public class DeleteNode {

	public static<T> boolean deleteNode (Node<T> pt){ //static<T>
		
		if (pt == null || pt.next ==null) //when node is at the end of linkedlist, will cause problem if deleted
		
			return false;
		
		else{
			T dd = pt.next.data;
			pt.next = pt.next.next;
			pt.data = dd;
	
			return true;
		}
	}
	
	
	
	public static void main (String[] args){
		
		Character[] charArray = new Character[] {'a','b','c','d','e','f'};
		LinkedListNode<Character> list = new LinkedListNode<Character>(charArray);
		
		Node<Character> n = list.head;
	    if (!deleteNode(n))
	    	System.out.println("Error");
	    else
	    	list.print();
		
	}
	
}
