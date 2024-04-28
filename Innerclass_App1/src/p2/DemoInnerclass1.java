package p2;
import p1.*;
public class DemoInnerclass1
{
	public static void main(String args[])
	{
	Subclass ob=new Subclass();
	ob.m1();
	Subclass.Subclass2 ob1= new Subclass.Subclass2();
	ob1.m2();
	Subclass.Subclass2.m3();
	}
	

}
