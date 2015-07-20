package CommonPrefix;
/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 */

public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs==null||strs.length==0){ // edge case !!!!
            return "";
        }
        
        if (strs.length==1){
            return strs[0];
        }
        
        String  str=strs[0];

        for (int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            
            for (int j=1; j<strs.length; j++){
                
                if (strs[j].length()==i || strs[j].charAt(i)!=c){
                    return str.substring(0, i); // substring output (beg, end-1)
                }
                
            
            }
        }
        
        return str;
           
       }
    

    
    
    public static void main (String []args){
    	
    	String []strs = {"ab", "abc", "abc3e", "abccc"};
    	CommonPrefix cc = new CommonPrefix ();
    	
    	String ss = cc.longestCommonPrefix(strs);
    	
    	System.out.println(ss);
    	
  
    }

}
