

package p2;
import java.util.*;
import java.util.function.*;
public class DemoList4
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			ArrayList<Float> ob=new ArrayList<Float>();
			ob.add(new Float(12));
			ob.add(new Float(13.2));
			ob.add(new Float(12));
			ob.add(new Float(46));
			System.out.println("==List<E>===");
			System.out.println(ob.toString());
			Function<Float,Float> fn=(n)->
			{
				return n+(2*n);
				
			};
			System.out.println("==List<E> After Function==");
			ob.forEach((k)->{
				System.out.println(fn.apply(k)+" ");
				
			});
			System.out.println("==OginalList<E>===");
			ob.replaceAll((n)->
			{
				return n+(2*n);
			});
			System.out.println("==Orginal List after replaceAll()==");
			System.out.println(ob.toString());
			
		}//end with resource
	   try
	   {
		   
	   }
	   catch(Exception e) {e.printStackTrace();}

	}

}
