
public class StringComparison {
	
	public static void main(String[] args) {
		
		String aa = "testing";
		
		String bb = "developing";
		
		
		String cc = "testingdeveloping";
		
		String dd = aa+bb;
		
		String ee = new String("testing");
		String ff = new String("testing").intern();
		
		System.out.println(cc==dd);
		System.out.println(cc.equals(dd));
		
		System.out.println(aa.equals(ee));
		System.out.println(aa==ff);
		
		
	}

}
