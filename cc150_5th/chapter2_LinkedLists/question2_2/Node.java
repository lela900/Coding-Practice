package question2_2;

public class Node<T> {

	public T data; 
    public Node<T> next;
	
    public Node(){
    	next = null;
    }
    
    
	public Node (T d) { //Constructor instead of Node<T>!!!
		
		data = d;
		next = null;
	}

}


