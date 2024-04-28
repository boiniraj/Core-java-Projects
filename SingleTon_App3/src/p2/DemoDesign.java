package p2;
import p1.*;
public class DemoDesign
{
	public static void main(String[] args)
	{
		ITest ob= Sclass.getRef();
		double res=ob.cal(55);
		System.out.println("Result:"+res);
	}

}
