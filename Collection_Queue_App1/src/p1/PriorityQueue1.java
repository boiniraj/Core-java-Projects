/*=>PriorityQueue&lt;E&gt;&#39; is an implementation class of Queue&lt;E&gt; and which
organizes
elements based of elements-priority.*/

//add the element last,remove the element first

package p1;
import  java.util.*;
public class PriorityQueue1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
	  PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	  System.out.println("==add(E)==");
	  pq.add(new Integer(10));
	  pq.add(new Integer(20));
	  pq.add(new Integer(30));
	  pq.add(new Integer(40));
	  pq.add(new Integer(50));
	  System.out.println(pq.toString());
	  System.out.println("==offer(E)==");//offer means add element order wise
	  pq.offer(new Integer(500));
	  System.out.println(pq.toString());
	  System.out.println("==remove()==");//remove element 
	  pq.remove();
	  System.out.println(pq.toString());
	  System.out.println("==poll()===");//remove element show the element order
	  pq.poll();
	  System.out.println(pq.toString());
	  System.out.println("===element()===");//show the elements
	  pq.element();
	  System.out.println(pq.toString());
	  System.out.println("===peek()===");//show the elements
	  pq.peek();
	  System.out.println(pq.toString());
	  
	  
	}

}
