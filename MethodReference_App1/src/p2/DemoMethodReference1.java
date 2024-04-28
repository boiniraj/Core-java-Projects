package p2;
import p1.*;
import p1.ITest;

public class DemoMethodReference1 {

	public static void main(String[] args)
	{   //Interface_name object_name =class_name:: new;
		ITest ob= Display :: new;//interface method call
		ob.dis(111);
		
		Display d= new Display(12);//constructor call
		//interface_name ob2=object_name ::Method_name;
		ITest ob2= d::m1;
		ob2.dis(22);//instance method call
		//Interface_name object_name=class_name::method_name;
		ITest ob3=Display:: m2;
		ob3.dis(99);//static method call
		
		
		

	}

}
