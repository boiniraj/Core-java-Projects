//method hiding in inheritance 
package p1;
public class Cclass extends Pclass
{
	public  static int k;
	public static void m1(int k)
	{
		System.out.println("Cclass m1()");
		System.out.println("The number"+k);
}
}
