package question1_2;

public class ReverseChar {

	public char[] reverseChar (String str){ //can only swap for char[]
		
		int len = str.length();
		char []strch = str.toCharArray();
		


		char temp; 
		
		for (int i = 0; i < len/2; i ++) {
			temp = strch[i];
			strch[i] = strch[len-1-i];
			strch[len-1-i] = temp;
		}
	    return strch; // can only swap for char[]
	}
	
	
	public static void main (String []args) {
		
		ReverseChar rev = new ReverseChar();
		String str1 = "abcdefg";
		
		char[] ch1 = rev.reverseChar(str1);
        str1 = new String(ch1); //convert char[] to String
		System.out.println(str1);
		
		
		
		
	}
	
}
