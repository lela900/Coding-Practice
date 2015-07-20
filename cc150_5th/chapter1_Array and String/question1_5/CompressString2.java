package question1_5;

public class CompressString2 {

	public String cmpString2 (String str){
		
		if (str == null || str.length() ==0 )
			return null; 
		if (str.length() ==1)
			return str+"1"; 
		
		int size = str.length();
		StringBuffer sb = new StringBuffer ();
		int []counter = new int[size];
		int i = 0; 
		int j = 0; 
		
		while (i < size){
			
			if (counter[j] ==0)
				counter[j] =1;
			if (i == size-1)
				break; 
			
			if (str.charAt(i+1) == str.charAt(i)){
				counter[j] ++; 
			}
			else{
				j ++; 
			}
			
			i ++ ; 
		}
		j = 0; 
		
		for (i = 0; i < size; i ++){
			if (i < size -1 && str.charAt(i) != str.charAt(i+1)){
				sb.append(str.charAt(i)); 
				sb.append(counter[j]);
				j ++; 
			}
			if ( i == size -1){
				sb.append(str.charAt(i));
				sb.append(counter[j]);
			}
				
			
		}
		
		if (sb.length() < str.length())
			return sb.toString(); 
		else
			return str; 
	}
	
	public static void main (String []args){
		
		String ss = "aabcccccb";
		CompressString2 cc = new CompressString2();
		String s2 = cc.cmpString2(ss);
		System.out.println(s2);
		
	
	}
	
}
