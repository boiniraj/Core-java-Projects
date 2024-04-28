package p1;

public interface ITest6 
{
	public abstract void m1(int a);
	public static void m2( int b)
	{
		System.out.println("**ITest6 static m1()**");
		System.out.println("Valur b:"+b);
	}
	public default void m3(int c)
	{
		System.out.println("** ITest6 Non-Staic m3()**");
		System.out.println("Value c:"+c);
	}

}
