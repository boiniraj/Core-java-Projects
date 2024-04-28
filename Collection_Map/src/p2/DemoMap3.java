package p2;
import java.util.*;
import java.util.function.*;
public class DemoMap3
{
	public static void main(String[] args)
	{
		LinkedHashMap<String,Float> ob=new LinkedHashMap<String,Float>();
		ob.put(new String("cj"),120.04f);
		ob.put(new String("sp"),150.05f );
		ob.put(new String("Rj"),160.44f);
		ob.put(new String("mvc"), 180.55f);
		System.out.println("***Dispaly Using entrySet()***");
		for(Map.Entry<String,Float> e:ob.entrySet())
		{
			System.out.println(e.getKey()+"\t"+e.getValue());
		}//end loop
		System.out.println("***BookPrice<150***");
		BiPredicate<String,Float> bp=(p,q)->//Perform some conditional operations on map object 
		{
			if(q>150) return true;
			else return false;
		};
		ob.forEach((k,y)->
		{
			if(bp.test(k, y))
				
			{
				System.out.println(k+"\t"+y);
			}
			
		});
		System.out.println("***BiFunction<T,U,R>(adding 50)***");
		BiFunction<String,Float,Float> fn=(p,q)->//perform functional operations on map object
		{
			return q+50;
			
		};
		ob.forEach((k,y)->
		{
			System.out.println(fn.apply(k, y));
			
		});
		System.out.println("***replaceAll()***");
		ob.replaceAll(fn);
		ob.forEach((k,y)->
		{
			System.out.println(k+"\t"+y);
			
			
			});
		
		System.out.println("***Immutable Map<K,V> Object***");
		Map<String,Float> m=Map.of("cj",123.06f, "sp",143.02f);
		m.forEach((a,z)->{
			System.out.println(a+"\t"+z);
			
		});
		
			
		
			

	}

}
