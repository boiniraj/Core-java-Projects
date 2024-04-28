package p2;
import p1.*;
import java.util.*;
public class Product1Sort
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	    try(s;)
	    {
	    	try {
	    		ArrayList<Product1> ob=new ArrayList<Product1>();
	    		ob.add(new Product1("A211","core","venkatesh",1200,4));
	    		ob.add(new Product1("B2B1","Sql","Sudhakar",1100,5));
	    		ob.add(new Product1("C231","Html","Shiva",1000,1));
	    		ob.add(new Product1("D201","js","sharma",1500,4));
	    		ob.add(new Product1("F231","AJ","mansani",1600,6));
	    		ob.add(new Product1("Z515","spb","nataraj",1200,4));
	    		System.out.println("====BookDetails===");
	    		ob.forEach((k)->{
	    			System.out.println(k);
	    		});
	    		while(true)
	    		{
	    		 System.out.println("==Choice==");
	    		 System.out.println("\t1.SortBycode"+"\n\t2.SortByname"+"\n\t3.SortByauthor"
	    		 +"\n\t4.SortByprice"+"\n\t5.SortByqty");
	    		 System.out.println("Enter the choice");
	    		 
	    		 switch(s.nextInt())
	    		 {
	    		 case 1:
	    			 ob.sort(new SotyBycode());
	    			 System.out.println("==SortByCode===");
	    			 ob.forEach((k)->{
	    				 System.out.println(k);
	    			 });
	    			 break;
	    		 case 2:
	    			 ob.sort(new SortByname());
	    			 System.out.println("==SortByName==");
	    			 ob.forEach((k)->{
	    				 System.out.println(k);
	    			 });
	    			 break;
	    		 case 3:
	    			 ob.sort(new SortByauthor());
	    			 System.out.println("==SortByAuthor==");
	    			 ob.forEach((k)->{
	    				 System.out.println(k);
	    			 });
	    			 break;
	    		 case 4:
	    			 ob.sort(new SortByprice());
	    			 System.out.println("==SortByPrice==");
	    			 ob.forEach((k)->{
	    				 System.out.println(k);
	    			 });
	    			 break;
	    			 
	    		 case 5:
	    			 ob.sort(new SortByqty());
	    			 System.out.println("===SortByQTY===");
	    			 ob.forEach((k)->{
	    				 System.out.println(k);
	    				 
	    			 });
	    			 
	    			 break;
	    		 case 6:
	    			 System.out.println("**Operation Stoped**");
	    			 System.exit(0);
	    			 default:{
	    				 System.out.println("Invalid choice");
	    				 
	    			 }
	    		 
	    		 }
	    		 
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    	}
	    	catch(Exception e) {e.printStackTrace();}
	    	
	    }//end try with resource
		

	}

}
