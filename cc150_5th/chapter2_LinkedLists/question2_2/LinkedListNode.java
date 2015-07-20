package question2_2;

public class LinkedListNode<T> {

	public Node<T> head;
	
	public LinkedListNode(T[] array){
		
		if (array.length < 0 || array == null){
			System.out.println("Error!!");
			System.exit(0);
		}
			
		else{	
			head = new Node<T> (array[0]);
			Node<T> beg = head;
			
			int i = 1; 
			
			while (i < array.length){
				
				beg.next = new Node<T>(array[i]);
				beg = beg.next;
				i++;
			}
		}
	
	}
	
	
	public void print (){
		
		if (head == null){
			System.out.println("Error!!");
			System.exit(0);
		}
			
		Node<T> beg = new Node<T>();
		beg = head;
		
		while (beg != null){
			System.out.printf(beg.data.toString() + " "); //!!! here don't miss toString 
			beg = beg.next;
		}
			
		System.out.println();
	}
	
	public int calLength(){
		
		Node<T> beg = head;
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
