package p2;
import p1.*;
public class DemoInnerclass3 
{
	public static void main(String[] args)
	{
		Subclass ob2=new Subclass();//outer class object
		ob2.m1();//outer class instance method call
		Subclass.m3();//outer class static method call
		

	}

}
