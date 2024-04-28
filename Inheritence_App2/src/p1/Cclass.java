//Over Riding process
package p1;
public class Cclass extends Pclass
{
	public int a;
	public void m1(int a)//overriding method
	{
		System.out.println("Cclass m1()");
		System.out.println("The number "+a);
	}

}
