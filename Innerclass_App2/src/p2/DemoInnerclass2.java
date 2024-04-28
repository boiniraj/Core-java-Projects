package p2;
import p1.*;
public class DemoInnerclass2
{
	public static void main(String[] args)
	{
		Suclass1 ob=new Suclass1();//outer class object creation
		ob.m1();//outer class method call
		Suclass1.Subclass2 ob1=ob.new Subclass2();//inner class object creation
		ob1.m2();                                 //Outerclass.innerclass object_name
		Suclass1.Subclass2.m3();                  //=Outer class object_name new inner_class name 
		       //instance inner class method call

	}

}
