package question1_1;
import java.util.*; 

public class CheckUnique {
	
	
	public  boolean checkUnique (String str) {
		
		if (str.length() > 256)
			return false;

		boolean []char_set = new boolean [256];
		
	    int val; 
	    
	    for(int i = 0; i < str.length(); i++) {
	    	
	    	val = str.charAt(i);
	    	
	    	if (char_set[val]) 
	    		return false;

	    char_set[val] = true;
	    
	    }
    		return true;
	
	
	}
	
	public static void main (String[] args){
		
		CheckUnique s1 = new CheckUnique(); //initialize object s1 of class of CheckUnique
		
		String aa = "abcdefzela";
		boolean b1 = s1.checkUnique(aa);
		
		String bb = "kdevfa#5 _";
		boolean b2 = s1.checkUnique(bb);
		
		System.out.printf("%s %b\n", aa, b1);
		System.out.printf("%s %b\n", bb, b2);
		
	
	}
	
}
