//Lambda Expression

package p1;
public class DemoThread9 {

	public static void main(String[] args)
	{
		new Thread(()->{
			for(int i=1;i<=5;i++)
			{
			      System.out.println("Task1");
			      try {
			    	  Thread.sleep(2000);
			    	  
			      }
			      catch(Exception e)
			      {
			    	  e.printStackTrace();
			      }
			}//end of loop	
		}).start();
		
		new Thread(()->{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Task2");
				try {
					Thread.sleep(2000);
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
		}).start();
		
	

	}

	
	}


