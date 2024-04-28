package p2;
import p1.*;
public class DemoInterface1 {

	public static void main(String[] args)
	{
		System.out.println("The value k:"+ITest.k);//)static variables in interface will get the memory within the interface while interface-loading and can be accessed withInterface name.
		IClass ob =new IClass();//implementation object created
		ob.m1();//method calls
		ob.m2();
		ob.m3(2345);



	}

}
