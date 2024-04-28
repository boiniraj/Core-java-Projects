//Lambda Expression

package p1;
import java.util.*;
public class DemoThread7 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Runnable ob=()->
		{
			try {
				
			
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+" "+new Date());
				Thread.sleep(2000);
				if(i==5)
				{
					Thread.currentThread().stop();
				}
			
			}//end loop
			
		}
		 catch(Exception e)
			{
			 e.printStackTrace();
			}
		

	};
	Thread t1=new Thread(ob);
	t1.start();
	
	Runnable ob2=()->
	{
		for(char j='A';j<='J';j++)
		{
			System.out.println(j+" "+new Date());
			try {
			Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}//end loop
		
	};
	Thread t2=new Thread(ob2);
	t2.start();

}
}
