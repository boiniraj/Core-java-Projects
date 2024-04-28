package p1;
public class Producer implements Runnable
{
	public StringBuffer sb=null;//StringBuffer is a non-primitive DataType 
	public Producer()//constructor intialize  the variable
	{
		sb=new StringBuffer();//non primitive DataType hold object references
	}
	public void run()//interface Runnable method 
	{
		try {
	   synchronized(sb)//object locking
	   {
		   for(int i=1;i<=10;i++)
		   {
			   sb.append(i+" : ");
			   System.out.println("Producer producing the data");
			   Thread.sleep(2000);
		   }//end of loop 
		   sb.notify();
		   
	   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	
}
