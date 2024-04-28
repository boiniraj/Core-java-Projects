package p1;

public class Selection
{
	public synchronized static void select(int n,String name)//static method synchronization
	{
		if(n<=Avalaible.av)
		{
			System.out.println(n+"tikkets booked for:"+name);
		Avalaible.av=Avalaible.av-n;
		}
		else {
			System.out.println("no tikets booked for"+name);
		}
	}

}
