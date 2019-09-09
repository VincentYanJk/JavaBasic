package javaDeadLock;

public class DeadLock {
    public static String obj1 = "obj1";
    public static String obj2 = "obj2";
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    
        Thread a = new Thread(new Thread1(),"Thread1");
        Thread b = new Thread(new Thread2(),"Thread2");
        a.start();
        b.start();
	}

}
