import java.security.PublicKey;

public class StringAndStringBuffertesting {

	
	public static void change(String s1,String s2) {
		
		s1 = s2;
		s2 = s1+s2;
		
	}
	
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = "Hello";
		String s4 = "He"+"llo";
/*		String s3 = s1 +s2;
		String s4 = "Hello"+"World";*/
        System.out.println(s1+"--"+s2);	
        change(s1, s2);
        System.out.println(s1+"--"+s2);	
        System.out.println(s1 == s3);	// 兩個引用 指向了同一個 值 所以相同
        System.out.println(s1 == s4);	
/*        
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));*/
		
        
        
        
		
	}

}
