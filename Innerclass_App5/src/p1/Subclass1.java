//using constructor static member inner class
package p1;
public class Subclass1 
{
	public int a;
	public static int b;
	 public  Subclass1 ( int a,int b)
	 {
		 this.a=a;
		 Subclass1.b=b;
		 }
	 public void m1()
	 {
		 System.out.println("**Outer class m1()**");
		 System.out.println("Value a:"+a);
		 System.out.println("Value b:"+b);
	 }
	 public  static class Subclass2
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
			 System.out.println("**Static innerclass instance method**");
			 System.out.println("Value c:"+c);
			 System.out.println("Value d:"+d);
			 System.out.println("Value b:"+b);
			 //System.out.println("Value a:"+a);
		 }
		 public static void m3()
		 {
			 System.out.println("**Static innerclass static method**");
			 System.out.println("Value b:"+b);
			 System.out.println("Value d:"+d);
		 }
	 }
	


}
