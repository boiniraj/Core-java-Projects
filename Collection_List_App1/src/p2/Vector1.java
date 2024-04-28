package p2;
import java.util.*;
public class Vector1
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{ 
		Vector<Integer> ob=new Vector<Integer>();
		System.out.println("default capacity of vector:"+ob.capacity());
		System.out.println("default size() Vector:"+ob.size());
		
		ob.addElement(12500);
		ob.addElement(1500);
		ob.addElement(10222);
		ob.addElement(10222);
		ob.addElement(10222);
		ob.addElement(10222);
		ob.addElement(10222);
		ob.addElement(10222);
		ob.addElement(10222);
		ob.addElement(10222);		
		System.out.println(" The value of ob:"+ob.toString());
		System.out.println(" capacity of vector:"+ob.capacity());
		System.out.println(" size() Vector:"+ob.size());
		
		

		
		
		System.out.println("===insertElementAt((E),Index)====");
		ob.insertElementAt(new Integer(100194005),10);
		System.out.println("capacity of vector:"+ob.capacity());
		System.out.println("size() Vector:"+ob.size());
		System.out.println(ob.toString());
		
		
		System.out.println("===firstElement()====");	
		System.out.println(ob.firstElement());
		System.out.println("===lastElement()====");	
		System.out.println(ob.lastElement());
		System.out.println("===elementAt()====");
		System.out.println(ob.elementAt(5));
		
		
		System.out.println("===Enumaration<E>==");
		Enumeration<Integer> e1= ob.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement()+" ");
		}
		
		
		System.out.println("\n=====Emuration<E>-asIterator()=====");
		Enumeration<Integer> e2=ob.elements();
		Iterator<Integer> it=e2.asIterator();
		it.forEachRemaining((k)->{
			System.out.println(k+" ");
			
		});
		
		
		
	}

}
