/*=>Deque is an interface from java.util package and which is extended from
Queue&lt;E&gt;.
=&gt;Deque&lt;E&gt; means double-ended-queue and which organizes elements on
both ends.*/

package p1;
import java.util.*;
public class Deque1
{
	@SuppressWarnings("removal")
	public static void main(String args[])
	{
		//(a)ArrayDeque<E> - organizes elements in Sequence
		ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
		System.out.println("==addFirst(E)==");
		dq.addFirst(new Integer(100));
		dq.addFirst(new Integer(200));
		dq.addFirst(new Integer(300));
		System.out.println(dq.toString());
		
		System.out.println("==addLast(E)==");
		dq.addLast(new Integer(400));
		dq.addLast(new Integer(500));
		System.out.println(dq.toString());
		
		System.out.println("==offerFirst(E)==");
		dq.offerFirst(new Integer(100));
		System.out.println(dq.toString());
		
		System.out.println("==offerLast(E)==");
		dq.offerLast(new Integer(200));
		System.out.println(dq.toString());
		
		System.out.println("==removeFirst()==");
		dq.removeFirst();
		System.out.println(dq.toString());
		
		System.out.println("==removeLast()==");
		dq.removeLast();
		System.out.println(dq.toString());
		
		System.out.println("==pollFirst()==");
		dq.pollFirst();
		System.out.println(dq.toString());
		
		System.out.println("==pollLast()==");
		dq.pollLast();
		System.out.println(dq.toString());
		
		System.out.println("==getFirst()==");
		dq.getFirst();
		System.out.println(dq.toString());
		
		System.out.println("==getLast()==");
		dq.getLast();
		System.out.println(dq.toString());
		
		
		System.out.println("==peekFirst()==");
		dq.peekFirst();
		System.out.println(dq.toString());
		
		System.out.println("==peekLast()==");
		dq.peekLast();
		System.out.println(dq.toString());
		
		

		System.out.println("==offerFirst(E)==");
		dq.offerFirst(new Integer(100));
		dq.offerFirst(new Integer(300));
		dq.offerFirst(new Integer(200));
		System.out.println(dq.toString());
		
		System.out.println("==offerLast(E)==");
		dq.offerLast(new Integer(200));
		dq.offerLast(new Integer(400));
		dq.offerLast(new Integer(500));
		System.out.println(dq.toString());
		
		
		System.out.println("removeLastOccurence(java.lang.Object)===");
		dq.removeLastOccurrence(200);
		System.out.println(dq.toString());
		
		
		System.out.println("removeFirstOccurence(java.lang.Object)===");
		dq.removeFirstOccurrence(100);
		System.out.println(dq.toString());
		
		System.out.println("===Iterator<E> iterator()===");
		Iterator<Integer> it=dq.iterator();
		it.forEachRemaining((k)->
		{
			System.out.println(k+" ");
		});
		
		System.out.println("\n==Iterator<E>-descendingIterator()==");
		Iterator<Integer> it2=dq.descendingIterator();
		it2.forEachRemaining((k)->
		{
              System.out.println(k+" ");		
		});
		
	//(b)LinkedList<E> - organizes elements in NonSequence	
		
		
		
		
		
		
		
		
		
		
	}

}
