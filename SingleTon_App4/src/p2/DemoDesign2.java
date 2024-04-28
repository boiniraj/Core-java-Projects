package p2;
import p1.*;
public class DemoDesign2
{
	public static void main(String args[])
	{
		ITest ob=Cclass.getRef();
		double res=ob.acces(44);
		System.out.println("Result:"+res);
	}

}
