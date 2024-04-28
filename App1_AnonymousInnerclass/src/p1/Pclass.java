package p1;
public class Pclass
{
	public int a;
	public static int b;
	public void m1()
	{
		System.out.println("--Pclass instance m1()--");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	public static void m2()
	{
		System.out.println("---Pclass Static m2()---");
		System.out.println("b:"+b);
	}
	

}
