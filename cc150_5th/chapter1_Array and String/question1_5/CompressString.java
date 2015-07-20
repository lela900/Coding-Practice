package question1_5;

public class CompressString {

	public static String compressString (String str){
		
		//Compare the length 
		int newLength = calSize(str);
		if (newLength > str.length())
			return str;
		
		else{
		
		//Brute force Method
		//	ptr = ptr + ch + counter; // Space O(N), Time O(K^2+N), N is the size of original string, 
			// K is the number of character sequences
		
			StringBuffer ptr = new StringBuffer();
		//String ptr = new String();
		
		int i = 1, counter = 1;
		char ch = str.charAt(0); 
		
		while (i < str.length()){
			
			if (str.charAt(i) == ch) {
				counter ++;
			}
			
			else{ 
			 ptr.append(ch); // Use StringBuffer, avoid O(K^2)
			 ptr.append(counter);
			 
			counter = 1;
			ch = str.charAt(i);
			}
			
			i++;
		}
	
		if (i == str.length()) {   // Attention the last string seq!!!!
		//	ptr = ptr + ch + counter;
			ptr.append(ch); 
		    ptr.append(counter);
		}
		return ptr.toString(); 
		}
	}
	
	
	public static int calSize (String str){
		
		if (str == null || str.isEmpty())
			return 0;
		
		char ch = str.charAt(0);
		int i = 1;
		int counter = 1; 
		int size = 0;
		
		while (i < str.length()){
			
			if(str.charAt(i) == ch){
				counter++;
			}
			else{
				
				ch = str.charAt(i);
				size = 1 + String.valueOf(counter).length()+ size; //String.valueOf: convert int to string
				counter =1 ;
				
			}
			i ++; 
			
		}
		if (i == str.length())
		{
			size = size + 2; 
		}
		
		return size;
	}
	
	
	public static void main(String []args){
		
		
		String str1 = "abcdef";
		String ptr1 = compressString(str1);
		
		String str2 = "bbdecdeff";
		String ptr2 = compressString(str2);
		
		String str3 = "aeeevdddfeee";
		String ptr3 = compressString(str3);
		
		String str4 = "aabcccccaaa";
		String ptr4 = compressString(str4);
		
		
		
		System.out.println(ptr1);
		System.out.println(ptr2);
		System.out.println(ptr3);
		System.out.println(ptr4);
		
		
		
	}
	
}
