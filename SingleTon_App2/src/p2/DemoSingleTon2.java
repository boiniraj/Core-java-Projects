package p2;
import p1.Lclass;
public class DemoSingleTon2
{

	public static void main(String[] args)
	{
		Lclass ob= Lclass.getRef();
		ob.dis(55);//Accessing object reference 
		

	}

}
