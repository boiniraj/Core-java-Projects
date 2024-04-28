package p2;
import java.util.*;
public class LikedList1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;)
		{
		 try {
			 LinkedList<String> ob1=new LinkedList<String>();
			 LinkedList<String> ob2=new LinkedList<String>();
			 LinkedList<String> ob3=new LinkedList<String>();
			 
			 System.out.println("Enter the number of Strings:");
			 int n=Integer.parseInt(s.nextLine());
		      System.out.println("Enter the " + n + " Strings:");
		      for(int i=1;i<=n;i++)
		      {
		    	  ob1.add(new String(s.nextLine()));
		    	  
		      }//end of loop
		      System.out.println("==List<E> of Strings==");
		      System.out.println(ob1.toString());
		      System.out.println("===Vowels-Consonents===");
		      ob1.forEach((k)->
		      {
		    	  char ch=k.charAt(0);
		    	  int av=(int)ch;
		    	  if((av>=65 && av<=90) || (av>=97 && av<=122))
		    	  {
		    		  switch(ch)
		    		  {
		    		  case 'a':
		  
		    		  case 'A':
		    			  ob2.add(k);
		    			  break;
		    		  case 'e':
		    			  
		    		  case 'E':
		    			  ob2.add(k);
		    			  break;
		    		  case 'i':
		    			 
		    		  case 'I':
		    			  ob2.add(k);
		    			 
		    			  break;
		    		  case 'o':
		    			  
		    		  case 'O':
		    			  ob2.add(k);
		    			  break;
		    		  case 'u':
		    			  
		    		  case 'U':
		    			  ob2.add(k);
		    			  break;
		    			  
		    			  default:
		    				  ob3.add(k);
		    		  
		    		  }//end of switch
		    		  
		    	  }
		    	  System.out.println(k);
		    	  
		    	  
		    	  
		      });
		      System.out.println("Vowels:"+ob2.toString());
	    	  
	    	  System.out.println("Consonents"+ob3.toString());
			 
		 }
		 catch(Exception e) {e.printStackTrace();}
			
		}//end of try with resource
		
	}

}
