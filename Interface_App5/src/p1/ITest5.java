package p1;

public interface ITest5
{
	
    private void m1(int b)//private concrete method can accessed by non primitive method 
    {
    	System.out.println("**Non Static m1()**");
    	System.out.println("value b:"+b);
    }
    private static void m2(int c)//static concrete method
    {
    	System.out.println("**static m3()");
    	System.out.println("value c:"+c);
    }
     public default void m4(int b,int c)// default can access "private method","Static method"
    {
    	this.m1(b);//same interface can access "this" keyword 
    	ITest5.m2(c);//static method can access same interface 
    	
    }
    

}
