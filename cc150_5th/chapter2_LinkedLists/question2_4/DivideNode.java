package question2_4;

public class DivideNode {
	

	public static Node divideNode (LinkedListNode list, int x){
		
		Node beg = list.head;

		
		Node head1 = new Node();
		Node head2 = new Node();
		
		Node beg1 = head1;
		Node beg2 = head2;
		
		
		while (beg!= null){
			
			if (beg.data < x){
			    beg1.next = new Node();
			    beg1.next.data = beg.data;
			    beg1 = beg1.next;
			}
			
			if (beg.data >= x){
				
				
				Node temp = new Node(beg.data);
				temp.next = beg2;
				
				if (beg2 == head2){
					temp.next = null;
				}
				beg2 = temp;
				}
			beg = beg.next;
		}
		
		
		
		beg1.next = beg2;
		
		return head1.next;

		
	}
	
	public static void main (String[] args){
		
		int []array = new int [] {3, 4, 5, 2, 9, 1};
		LinkedListNode list = new LinkedListNode(array);
		
		list.print();
		int x = 5;
	    Node newHead = divideNode(list, x);
		
	    LinkedListNode newList = new LinkedListNode(newHead);
	    newList.print();
	
	}
}
