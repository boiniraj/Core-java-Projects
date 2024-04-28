//(Constructor Overloading process)
//The process of interlinking Constructors using &#39;super()&#39; and &#39;this()&#39;
//is known as Constructors Chaining Process,and which is also known as
//Constructor Interlinking process.

package p1;
public class Cclass extends Pclass 
{
	public Cclass(int a,int b,int c)
	{
		super( a, b);
		System.out.println("c:"+c);
	}
	public Cclass(int a,int b,int c,int d)
	{ 
		this(a,b,c);
		System.out.println("d:"+d);
	}

}
