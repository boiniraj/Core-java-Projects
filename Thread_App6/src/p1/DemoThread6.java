//Thread in AnonumousInnerClass

package p1;
import java.util.*;
public class DemoThread6  {
	public static void main(String[] args) {
		
		Runnable ob=new Runnable()
				{
			public void run()
			{
				try {
				for (int i=1;i<=10;i++)
				{
					System.out.println(i+" "+new Date());
					Thread.sleep(2000);
					
			
				}//end loop	
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			}
				};
				Thread t1=new Thread(ob);
				t1.start();
		 
	     Runnable ob2=new Runnable()
	    		 {
	    	 public void run()
	    	 {
	    		 try {
	    		 for(char i='A';i<='J';i++)
	    		 {
	    			 System.out.println(i+" "+new Date());
	    			 Thread.sleep(2000);	    			 
	    			 
	    		 }
	    		 }
	    		 catch(Exception e)
	    		 {
	    			 e.printStackTrace();
	    		 }
	    		 
	    	 }
	    	 
	    		 };
	    		 
	    		 Thread t2=new Thread(ob2);	    	     
	    	     t2.start();
	    	     t2.setPriority(Thread.MAX_PRIORITY);
	    	     t1.setPriority(Thread.MIN_PRIORITY);
	    	     
	    	     
	    		 
		
		

	}

}
