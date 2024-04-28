//Static member innerclass

package p1;
public class Subclass
{
	public int a=10;
	public static int b=20;
	public void m1()
	{
		System.out.println("**OuterClass m1()");
		System.out.println(" Outer instance Value a:"+a);
		System.out.println("Outer Static Value b"+b);
	} //outer class
	public static class Subclass2//static member inner class
	{
		public int c=30;
		public static int d=40;
		public void m2()
		{
			System.out.println("**Static innerclass instance method m2()**");
			System.out.println("Value c:"+c);
			System.out.println("Value d:"+d);
			System.out.println("Outer class Static Value b:"+b);
			//System.out.println("Value a"+a);	
		}
		public static void m3()
		{
			System.out.println("**Static innerclass static method m3()**");
			System.out.println("Value d:"+d);
			System.out.println(" Outer class static Value b:"+b);
		  
		}//inner class
		
	}
}




