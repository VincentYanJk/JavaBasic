package interview;

  
public class PalindromeForStringWord { 
  
	
	// Find the longest palindrome word 
    static String getLongestPalindromeWord(String str) { 
        
        String longestWord = "", extractWord = ""; 
        
        int length, length1 = 0; 
        for (int i = 0; i < str.length(); i++)  
        { 
            char ch = str.charAt(i); 
            if (isEnglishWord(ch)) {
            	extractWord = extractWord + ch; 

            } else { 
                length = extractWord.length(); 
                if (isPalindromeWord(extractWord) && length > length1) { 
                    length1 = length; 
                    longestWord = extractWord; 
                } 
                
                extractWord = ""; 
            } 
        } 
  
        return longestWord; 
    } 
    
    // The method is using to judge the given char is English char or not.
    
    static boolean isEnglishWord(char target) {
    	
    	if(target>='a'&& target <='z'||target >='A'&& target <='Z' ) {
          return true ;
    		
    	}
		
    	return false;
    	
	}
    
    // The method is to check  whether the word is palindrome or not.
    static boolean isPalindromeWord(String word) {
        int n = word.length(); 
 
        // ignore case insensitive 
        word = word.toLowerCase();  
        // loop to check palindrome 
        for (int i = 0; i < n; i++, n--) {
            if (word.charAt(i) !=  
                       word.charAt(n - 1)) 
                return false; 
        }
        return true; 
    } 
  
    //Local testing
    public static void main(String args[]) { 
        String target = new String("This is racecar and madam, but the number is 121."); 
  
        if ("".equals(getLongestPalindromeWord(target)) ) {
        	System.out.println("No Palindrome Word"); 
	
        }else {
        	
        	System.out.println(getLongestPalindromeWord(target));	
        	
        }
        
    }
}