package p1;
import java.util.*;
public class DemoArray1
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;){		
		try {
			System.out.println("Enter the Array:");
			int n=s.nextInt();
			Integer a[]=new Integer[n];//Array object Creation
			System.out.println("Enter the Array:"+n+":Interger value");
			for(int i=0;i<a.length;i++)
			{
				a[i]=new Integer(s.nextInt());
				
			}//end of loop
			System.out.println("***Dispaly Array using Old for-loop***");
			for(int i=0;i<a.length;i++)
			{
				System.out.println("Values: "+a[i].toString());
			}
			System.out.println("\n===Dispaly Array Using Extended-for(java5)====");
			for(Integer k:a)
			{
				System.out.println(k.toString()+" ");
			}
			System.out.println("\n===Dispaly Array Using Spliterator<T>(java8)===");
			Spliterator<Integer> sp= Arrays.spliterator(a);
		
				sp.forEachRemaining((k)->
				{
				   System.out.println(k.toString()+" ");	
				});
				System.out.println("\n===Sorted-Array===");
				Arrays.sort(a);
				Spliterator<Integer> sp2=Arrays.spliterator(a);
				sp2.forEachRemaining((k)->
				{
					System.out.println(k.toString()+" ");
					
				});
					  
		     }//end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource
		
		

	

}
}