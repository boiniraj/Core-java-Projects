package p1;
public class Selection
{
	//instance method locking using synchronized keyword
	public synchronized void select(int n,String name)
	{
		if(n<=Avalable.av)
		{
			System.out.println(n+"tikets booked for"+ name);
			Avalable.av=Avalable.av-n;
			
		}
		else {
			System.out.println("No tikets booked for"+ name);
		}
	}
	

}
