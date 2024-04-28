package p2;
import p1.Sclass;

public class DemoSingleTon1 {

	public static void main(String[] args)
	{
		//Sclass ob=new Sclass(); con_call
		Sclass ob=Sclass.getRef();
		ob.dis(123);//Accessing object reference 
		

	}

}
