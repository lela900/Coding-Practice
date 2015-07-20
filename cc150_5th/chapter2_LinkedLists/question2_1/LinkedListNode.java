package question2_1;
import java.util.Hashtable;

public class LinkedListNode <T> {

	public Node<T> head;
	

	public LinkedListNode (T[] dataArray) {
		
		if (dataArray.length < 0 || dataArray == null)
		{
			System.out.println("Error input array!");
			System.exit(0);
		}
		
		
		else{
			
			head = new Node<T> (dataArray[0]);
			Node<T> beg = head;
			int i = 1; 
			
			while (i<dataArray.length)
			{ 
			    beg.next = new Node<T> (dataArray[i]);
			    beg = beg.next;
				i ++; 
			}
		}
	}
	
	public void print (){
		
		
		Node<T> beg = head;
		while (beg!=null)
		{
			System.out.printf(beg.data.toString()+" ");
			beg = beg.next;
		
		}
		System.out.println();
	}
	
	//Method 1, Time O(N), Space (N)
	public void removeRepeated1 (){  
		
		if (head == null)
			return;
		
		
		Hashtable table = new Hashtable();
		
		Node<T> beg = null;
		Node<T> cur = head;
		while (cur != null){
			
			if (table.containsKey(cur.data))
				beg.next = cur.next;
			else{
				table.put(cur.data, true);
				beg = cur;
				
			}
			cur = cur.next;
		}
	}
	
	
	//Method 2, FOLLOW-UP Time O(N^2), Space (1)
	public void removeRepeated2() {
		
		if (head == null)
			return;
		
		else{
			
			Node<T> beg = head;
			Node<T> end ;
			
			while (beg.next!= null){
				end = beg;
				while (end.next !=null){
				
				if (beg.data == end.next.data){
					end.next = end.next.next;
				}
				else
					end = end.next;
			}
			beg = beg.next;
			
			}
			
		}
		
	}
	
	
	
	
	
	
	public static void main (String []args) {
		
		Integer[] array = new Integer[] {6,4,3,1,1,4,3}; // use Integer instead of int!!
		
		LinkedListNode <Integer> list1 = new LinkedListNode <Integer> (array);
		
		list1.print();
		
		list1.removeRepeated1();
		list1.print();
		
		list1.removeRepeated2();
		list1.print();
		
	}
	
	
	
	
	
	
}