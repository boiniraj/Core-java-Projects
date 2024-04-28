/*define Predicate<T>?
=>Predicate<T> is a functional interface from java.util.function package
introduced
by Java8 version and which is used to perform Conditional operation on
Collection<E>;
Objects.
structure of Predicate&lt;T&gt;:
public interface java.util.function.Predicate&lt;T&gt;
{
public abstract boolean test(T);
...
}

syntax of LambdaExpression:
Predicate&lt;T&gt; p = (T)-&gt;
{
...
};
 */


package p2;
import java.util.*;
import java.util.function.*;

public class Demolist2 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
	ArrayList<Integer> al= new ArrayList<Integer>();
	al.add(new Integer(10));
	al.add(new Integer(20));
	al.add(new Integer(30));
	al.add(new Integer(40));
	al.add(new Integer(50));
	al.add(new Integer(60));
	System.out.println("**List**");
	System.out.println(al.toString());
	Predicate<Integer> p=(n)->
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}//end loop
		if(count==2) return true;
		else return false;
	
			
	};
	System.out.println("===Iterator<E>-forEachRemaining===");
	Iterator<Integer> it=al.iterator();
	it.forEachRemaining((k)->
	{
		if(p.test(k))
		{
		System.out.println(k+" ");
		}
	});
	System.out.println("\n====Dispaly List<E> whithout prime===");
	Iterator<Integer> it2=al.iterator();
	while(it2.hasNext())
	{
		Integer ob=it2.next();
		if(p.test(ob)) {
			it2.remove();
		}
		
	}//end of loop
	System.out.println(al.toString());
	
	
	}
       
	}


