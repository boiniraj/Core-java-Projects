//SingleTon class design pattern
//1.private static reference variable
//2.private constructor
//3.static method
//This is Early instantiation process

package p1;
public class Sclass 
{
	private static Sclass ob;//1.private static reference variable
	private Sclass() {}//2.private constructor
	
	static {//early instantiation process object created static block
		ob=new Sclass();
	       }
	public static Sclass getRef()//3.static method
	{
		return ob;
	}
	public void dis(int k)
	{
		System.out.println("**dis()***");
		System.out.println("The value k:"+k);
	}
 
}
