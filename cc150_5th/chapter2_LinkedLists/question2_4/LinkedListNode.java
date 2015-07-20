package question2_4;


public class LinkedListNode {

public Node head;
	
    public LinkedListNode(Node h){
    	head = h;
	   
   }

	public LinkedListNode(int[] array){
		
		
			head = new Node (array[0]);
			Node beg = head;
			
			int i = 1; 
			
			while (i < array.length){
				
				beg.next = new Node (array[i]);
				beg = beg.next;
				i++;
			}
		}
	
	
	
	
	public void print (){
		
		if (head == null){
			System.out.println("Error!!");
			System.exit(0);
		}
			
		Node beg = new Node();
		beg = head;
		
		while (beg != null){
			System.out.printf(beg.data + " "); //!!! here don't miss toString 
			beg = beg.next;
		}
			
		System.out.println();
	}
	
	public int calLength(){
		
		Node beg = head;
		int size = 0; 
		
		if (head == null)
			return 0;
		else{
			while (beg != null){
				size ++;
				beg  = beg.next;
			}
			return size;
				
	}
	}	
}
	
	
	
	
	
