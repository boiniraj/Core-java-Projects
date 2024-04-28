//The concept in which the refered object-reference is available to
//one object only,is known as Tightly Coupled Reference
//1.References - Interlinking Objects:
package p1;
public class C1 
{
	public int a=10;
	public C2 ob2=new C2();
	public void m1()
	{
		System.out.println("***C1_M1()***");
		System.out.println("The value a:"+a);
		System.out.println("The value b:"+ob2.b);
		
		
	}

}
