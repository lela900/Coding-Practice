package question1_3;

public class CheckPermutation {

	
	public boolean checkPermutation (String str1, String str2) {
		
			if (str1 == null || str2 == null) 
				return false;
			
			if (str1.length()!= str2.length())
				return false;
			
	
		int []charSet = new int[256];
		
		int val;
		
		for (int i = 0; i < str1.length(); i++){
			
			val = str1.charAt(i);
			charSet[val] ++;
		}
			
		for (int i = 0; i <str2.length(); i++){
			val = str2.charAt(i);
			charSet[val] --;
			
			if (charSet[val] < 0)
				return false;
		}
			
		
		
		return true;
		
	}
	
	public static void main (String []args){
		
		String str1 = "abc";
		String str2 = "cepeferer";
		String str3 = "cab";
		
		CheckPermutation c1 = new CheckPermutation(); //() cannot miss!!!!
		boolean b1 = c1.checkPermutation(str1, str2);		
		boolean b2 = c1.checkPermutation(str1, str3);
		
		System.out.println(b1);
		System.out.println(b2);
	}
}
