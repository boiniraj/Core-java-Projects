//instance member inner class
package p1;
public class Suclass1
{
	public int a=100;
	public static int b=200;
	public void m1()
	{
		System.out.println("**Outer class**");
		System.out.println("Value a:"+a);
		System.out.println("Value b:"+b);
	}
	public class Subclass2//instance member inner class can be accessed 
	{                     //outer class member and inner class members 
		public int c=300;
		public static int d=400;
		public void m2()
		{
			System.out.println("**Instance Innerclass Instancemethod**");
			System.out.println("Value a:"+a);
			System.out.println("Value b:"+b);
			System.out.println("Value c:"+c);
			System.out.println("Value d:"+d);
		}
		public static void m3()//static method inner class can accessed outer class
		                       //static member and inner class static member
		{
			System.out.println("**Instance innerclass Staticmethod**");
			System.out.println("value b:"+b);
			System.out.println("Value d:"+d);
		}


	

}
}
