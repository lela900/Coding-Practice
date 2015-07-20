package question1_4;

public class ReplaceSpace {

//	public char[] replaceAllSpace (String s1, int length){ // when change the value of String in the method, it is immutable. 
		//Must use an array to return value!!! Or use char[] as input 
//		char []array = s1.toCharArray();
	
	public void replaceAllSpace (char[] array, int length) {
		
		int i = 0, counter = 0; 
		
		while (i < length){
			
			if (array[i] == ' ')
				counter ++;
			i ++;
		}
		
		int newlength = counter*2 + length;
		int k = 0; 
		
   	    for (i = newlength -1; i >= 0; i--)	{ //backwards! otherthan O(time) will be large
			
   	    	if (array[length-1-k] == ' '){
   	    		array[i] = '0';
   	    		array[i-1] = '2';
   	    		array[i-2] = '%';
   	    		
   	    		i = i - 2;
   	    	}
   	    	
   	    	else {
   	    	array[i] = array[length-1-k];
   	    	}
   	    	k++;
			
		}
		
  // 	    return array;
	}
	
	public static void main (String []args) {
		
		String s1 = "Mr John Smith    ";
		char []arr = s1.toCharArray();
		int length = 13;
		ReplaceSpace r1 = new ReplaceSpace();
		
	//	char []arr = r1.replaceAllSpace(s1, length);
		
		r1.replaceAllSpace(arr, length);
		
		System.out.println(arr);
		
	}
	
	
	
}
