package p2;
import p1.*;
public class DemoInterface4
{
	public static void main(String args[])
	{
		ITest4.m2(12);//static concrete method call interface_name.method_name  
		Iclass4 ob=new Iclass4();//default concrete method call implementation 
		                          //class name,default concrete method is a 
		                          //non static concrete method
		                          //its create object and call the object name
		ob.m3(44);
	}

}
