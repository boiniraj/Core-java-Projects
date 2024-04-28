package p1;
import java.util.*;
public class DemoLinkedHashSet {

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> ob1=new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> ob2=new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> ob3=new LinkedHashSet<Integer>();
		
		
		ob1.add( new Integer(11));
		ob1.add( new Integer(20));
		ob1.add( new Integer(30));
		
		ob2.add( new Integer(11));
		ob2.add( new Integer(20));
		ob2.add( new Integer(33));
		
		ob3.add( new Integer(40));
		ob3.add( new Integer(33));
		ob3.add( new Integer(60));
		System.out.println("ob1="+ob1.toString());
		System.out.println("ob2="+ob2.toString());
		System.out.println("ob2="+ob3.toString());
		
		System.out.println("**addAll()***");
		ob1.addAll(ob2);
		System.out.println("ob1="+ob1.toString());
		System.out.println("ob2="+ob2.toString());
		System.out.println("ob2="+ob3.toString());
		
		System.out.println("**contains(Object)**");
		boolean k=ob1.contains(new Integer(11));
		System.out.println("ele 12 available in ob1:"+k);
		
		System.out.println("**containsAll()**");
		boolean z=ob1.containsAll(ob3);
		System.out.println("ob1 contains ob3:"+z);
		
		System.out.println("***retainAll()***");
		ob1.retainAll(ob2);
		System.out.println("ob1="+ob1.toString());
		System.out.println("ob2="+ob2.toString());
		System.out.println("ob3="+ob3.toString());
		
		
		System.out.println("****removeAll()*****");
		ob1.removeAll(ob3);
		System.out.println("ob1="+ob1.toString());
		System.out.println("ob2="+ob2.toString());
		System.out.println("ob3="+ob3.toString());
		
		System.out.println("***clear()***");
		ob1.clear();
		System.out.println("ob1="+ob1.toString());
		System.out.println("ob2="+ob2.toString());
		System.out.println("ob3="+ob3.toString());
		System.out.println("===Immutable Set<E>===");
		Set<Integer> ob4=Set.of(12,13,14,15,16);
		System.out.println("ob4="+ob4.toString());
		//ob4.add(new Integer(500));
	
		
	}
	   

}
