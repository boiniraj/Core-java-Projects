package p1;

public class IClass implements ITest//These implementation classes must construct body for all abstract methods of Interface.
{
	public void m1()//abstract method body 
	{
		System.out.println("****m1()***");
		System.out.println("value:"+k);
	}
	public void m2()//abstract method body
	{
		System.out.println("****m2()***");
		System.out.println("value:"+k);
	}
	public void m3(int s)// These implementation classes can also be declared with Non implemented methods
	{                      //non implemented method
		System.out.println("****m3()***");
	   System.out.println("value:"+k);
	   System.out.println("value:"+s);
	}

}
