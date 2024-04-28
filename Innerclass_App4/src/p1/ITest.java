package p1;

public interface ITest
{
	public abstract void m4(int d);
	public default void m5(int e)
	{
		System.out.println("**Default method**");
		System.out.println("Value e:"+e);
	}

}
