package p2;
import java.util.*;
import java.util.function.*;
public class DemoMap4 
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
			ob.forEach((k,w)->
			{
				if(bp.test(k, w))
				{
				System.out.println(k+"\t"+w);
				}
				
			});
		

	}

}
