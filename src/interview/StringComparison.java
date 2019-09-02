package interview;

public class StringComparison {
	
	public static void main(String[] args) {
		
		String aa = "testing";
		
		String bb = "developing";
		
		
		String cc = "testingdeveloping";
		
		String dd = aa+bb;
		String oo = "testing"+"developing";
		
		String ee = new String("testing");
		String ff = new String("testing").intern();
		
//		System.out.println(dd==oo);
		System.out.println(ee==ff);
		//System.out.println(aa==ee);
		
/*		System.out.println(cc==dd);
		System.out.println(cc.equals(dd));
		
		System.out.println(aa.equals(ee));
		
<<<<<<< HEAD
		System.out.println(aa==ff);*/

		System.out.println(aa==ff);

	
		
		
		
	}

}
