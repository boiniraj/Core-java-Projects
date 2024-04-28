package p2;
import P1.*;
public class DemoGeneric1 
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		Display<Integer> ob1=new Display<Integer>();
		Display<String> ob2=new Display<String>();
		Display<User> ob3=new Display<User>();
      //seterMethods
		ob1.setOb(new Integer(12));
		ob2.setOb(new String("Hyd-NIT"));
		ob3.setOb(new User("Raj","r@gmail.com"));
		//getter methods
		System.out.println("Int-Value:"+ob1.getOb());
		System.out.println("String-Value:"+ob2.getOb());
		System.out.println("User-Value:"+ob3.getOb());
		
	}

}
