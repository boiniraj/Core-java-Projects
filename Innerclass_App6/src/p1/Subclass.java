//MemberInnerClass//
//InstanceInnerClass Using Constractor

package p1;
public class Subclass
{
	public int a;
	public static int b;
	public Subclass(int a,int b)
	{
		this.a=a;
		Subclass.b=b;
	}
	public void m1()
	{
		System.out.println("**Outer class m1()**");
		System.out.println("The value a:"+a);
		System.out.println("The Vlaue b:"+b);
	}
	public class Subclass2
	{
		public int c;
		public static int d;
		public Subclass2(int c,int d)
		{
			this.c=c; 
			Subclass2.d=d;	
		}
		public void m2()
		{
			System.out.println("**InnerClass instance m2()");
			System.out.println("The Value c:"+c);
			System.out.println("The Value d:"+d);
			System.out.println("The Value a:"+a);
			System.out.println("The Value b:"+b);
		}
		public static void m3()
		{
			System.out.println("InnerClass Static m3()");
			System.out.println("The Value d:"+d);
			System.out.println("The Value b:"+b);
		}
	}

}
