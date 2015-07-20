package question1_8;

public class IsSubString {
	
	public static boolean isRotation (String str, String ptr){
		
		if (str.length() > 0 && str.length() == ptr.length()) {
		String qq  = ptr + ptr;
		return isSubstring (qq, str);
		
	}
	
		return false;
	}
		
		
		public static boolean isSubstring(String str, String ptr){
			
			if (str.indexOf(ptr) >= 0)
				return true;
			else
				return false;
			
		}
		
		
		public static void main(String[] args) {
			String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
			for (String[] pair : pairs) {
				String word1 = pair[0];
				String word2 = pair[1];
				boolean is_rotation = isRotation(word1, word2);
				System.out.println(word1 + ", " + word2 + ": " + is_rotation);
			}
		}

}
