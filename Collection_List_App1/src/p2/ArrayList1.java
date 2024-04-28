package p2;
import java.util.*;
public class ArrayList1
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ArrayList<Integer> vr= new ArrayList<Integer>();
		ArrayList<Integer> sr=new ArrayList<Integer>();
		ar.add(new Integer(10));
		ar.add(new Integer(20));
		ar.add(new Integer(30));
		
		vr.add(new Integer(40));
		vr.add(new Integer(50));
		vr.add(new Integer(60));
		
		sr.add(new Integer(70));
		sr.add(new Integer(80));
		sr.add(new Integer(90));
		
		System.out.println("Elements in ar:"+ar.toString());
		System.out.println("Elements in vr:"+vr.toString());
		System.out.println("Elements in sr:"+sr.toString());
		
		System.out.println("==addAll()==");
		ar.addAll(vr);
		System.out.println("Elements in ar:"+ar.toString());
		System.out.println("Elements in vr:"+vr.toString());
		System.out.println("Elements in sr:"+sr.toString());
		
			System.out.println("==addAll(index)");
			sr.addAll(2,vr);
			System.out.println("Elements in vr:"+vr.toString());
			System.out.println("Elements in sr:"+sr.toString());
			
			
			System.out.println("==indexOf(Object)==");
			int i=ar.indexOf(30);
			System.out.println("Elements in vr:"+ar.toString());
			System.out.println("index of element 30 in all this:"+i);
			
			System.out.println("==lastIndexOf(Object)==");
			int i1=ar.lastIndexOf(50);
			System.out.println("Elements in vr:"+ar.toString());
			System.out.println("lastindex of ele 60 in all is :"+i1);
			
			System.out.println("==sublist(int int)===");
			List<Integer> li=ar.subList(2, 5);
			System.out.println("Elements in ar:"+ar.toString());
			System.out.println("subList(2,5):"+li.toString());
			
			System.out.println("===Immutable List<E> Object using of()===");
			List<Integer> ob=List.of(100,200,300,400,500);
			System.out.println("Elements from ob:"+ob.toString());
			
			System.out.println("==ListIterator()===");
			ListIterator<Integer> lt=ar.listIterator();
			System.out.println("Forward Direction..");
			while(lt.hasNext())
			{
				 System.out.print(lt.next()+" ");
			}
			
		System.out.println("\n==BackwardDirection===");
			while(lt.hasPrevious())
			{
				System.out.print(lt.previous()+" ");
			}
			
			System.out.println("\n==ListIterator(index)=="); 
			ListIterator<Integer> lt1= ar.listIterator(3);
			System.out.println(ar.toString());
			System.out.println("==ForwardDirection==");
			while(lt1.hasNext())
			{
				System.out.print(lt1.next()+" ");
			}
			System.out.println("\n==BackwordDirection===");
			while(lt1.hasPrevious())
			{
				System.out.print(lt1.previous()+" ");
			}
			System.out.println("\n==Cover to Array-Object===");
			Object o[]=ar.toArray();
			for(Object k : o)
			{
				System.out.print(k.toString()+" ");
			}
		
			
			
			
		

	}

}
