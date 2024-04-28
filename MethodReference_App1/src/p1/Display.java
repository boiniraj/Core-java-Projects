package p1;
public class Display
{
	public Display(int a)//constructor
	{
		System.out.println("Constroctor");
		System.out.println("The Value a:"+a);
	}
	public void m1(int b)//instance method
	{
		System.out.println("Instance method");
		System.out.println("The value b:"+b);
	}
	public static void m2(int c)//static method
	{
		System.out.println("Static method");
		System.out.println("The value c:"+c);
	}

}
