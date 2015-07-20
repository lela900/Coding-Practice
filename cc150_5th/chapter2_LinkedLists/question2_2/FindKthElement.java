package question2_2;

import question2_2.LinkedListNode;
import question2_2.Node;

public class FindKthElement<T> {
	
    LinkedListNode <T> list;

	
	//Method 1: Time O(N), Space O(1)
	public static <T> T findKthElement(LinkedListNode<T> list, int K){ //!!!!static <T> otherwise can't match to a non-static 
		
		if (K <= 0 || K > list.calLength()){
			System.out.println("Error!!");
			return null;  // return null!!! 
		
		}
		
			int i = 1; 
			Node<T> beg = list.head;
			Node<T> end = beg;
		
			while (i < K) {
				end = end.next;
				i++;
			}
			
			while (end.next!=null){
				beg = beg.next; 
				end = end.next;
			}
			
			return beg.data;
		
	}
	
	

	//Method 2: recursive
	//Time O(N) Space O(N)
	
	public static <T> int findKthElement2(Node<T> head, int K){ 
	
		if (K <= 0 ){
			System.out.println("Error!!");
			System.exit(0);;  // return null!!! 
		
		}
		
		if (head == null)
			return 0;
		
		else{
			
			int i = findKthElement2(head.next, K) + 1; 
			if (i == K)
				System.out.println(head.data.toString());
			
		
		return i;
	}
	}
	
	public static void main (String[] args){
		
		
	//	Integer[] array = new Integer[] {1,2,3,4};     // int -> Integer
	//	LinkedListNode <Integer> list1 = new LinkedListNode <Integer> (array);
		
	Character[] letter = new Character[] {'a','b','c','d','e', 'f','g','h'};
	LinkedListNode <Character> list1 = new LinkedListNode <Character> (letter); // char -> Character
		
    list1.print();
    
    int K1 = 0, K2 = 1, K3 = 3, K4 = 9, K5 = 7; 
/*
    System.out.println(findKthElement(list1, K1));
    System.out.println(findKthElement(list1, K2));
    System.out.println(findKthElement(list1, K3));
    System.out.println(findKthElement(list1, K4));
    System.out.println(findKthElement(list1, K5));
*/
    
  
//   findKthElement2(list1.head, K1);
     findKthElement2(list1.head, K2);
 //  findKthElement2(list1.head, K3);
//   findKthElement2(list1.head, K5);
   
	}
	
}
