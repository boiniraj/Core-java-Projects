package p1;
import java.util.*;
public class Register implements Runnable
{
	public void run()
	{
	  for(int i=1;i<=5;i++)
	  {
		  System.out.println("Registration process...Raj:"+new Date());
		  try {
			  Thread.sleep(2000);
		  }
		  catch(InterruptedException ie)
		  {
			  ie.printStackTrace();
			  
		  }
		  
		  
		  
		  
		  
	  }
		
		
		
		
		
	}

}
