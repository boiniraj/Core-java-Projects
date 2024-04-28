package p1;
public class Subclass
{
	public void m1()
	{
		class Subclass1
		{
			public void m2(int a)
			{
				System.out.println("**local Instance m2()");
				System.out.println("Value a:"+a);
			}
		}//Local innerClass(instance member innerClass
		Subclass1 ob=new Subclass1();
		ob.m2(11);	
	}//outer class instance method
	public static void m3()
	{
		class Subclass2
		{
			public void m4(int b)
			{
				System.out.println("**local Staticmethod m4**()");
				System.out.println("Value b:"+b);
			}
		}//local innerClass(Static member innerClass)
		Subclass2 ob1=new Subclass2();
		ob1.m4(44);
		
	}//outer class static method
	

}//outer class
