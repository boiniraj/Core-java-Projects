//2.Inheritance - Interlinking Classes 
//The process of interlinking two classes with extends  keyword is
//known as Inheritance process.
//In Inheritance process the members(features) of one class are
//available to another class.
//this is single inheritance

package p1;
public class C1
{
	public int a;
	public static int b;
	public void m1()
	{
		System.out.println("**pclass m1()**");
		System.out.println("The number a"+a);
		System.out.println("The number b"+b);
	}
	  public static void m11()
	{
		  System.out.println("**pclass m11()**");
		  System.out.println("The number b"+b);
		
	}

}

