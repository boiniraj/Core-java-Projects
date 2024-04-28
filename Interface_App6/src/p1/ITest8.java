package p1;

public interface ITest8 
{
	public abstract void m1(int a);
	public static void m2(int b)
	{
		System.out.println("** ITest7static m1()**");
		System.out.println("Value b:"+b);
	}
	public default void m33(int c)
	{
		System.out.println("** ITest7 non-static m3()**");
		System.out.println("value c:"+c);
		
	}

}
