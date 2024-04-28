package p1;
public class Consumer implements Runnable
{
	public Producer pro=null;//Producer class initializes the variable it means hold the reference of object
	public Consumer(Producer pro)//pro variable  provaided producer object to Consumer
	{
		this.pro=pro;
	}
	public void run()
	{
		try {
		synchronized(pro.sb)
		{
			System.out.println("Consumer started but blocked");
			pro.sb.wait();//wait consumer class until producer write the data in string buffer 
			System.out.println("===Display using consumer===");
			System.out.println(pro.sb.toString());//producer write the data on StringBuffer after Buffer object call consumer class  	
			
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

}
