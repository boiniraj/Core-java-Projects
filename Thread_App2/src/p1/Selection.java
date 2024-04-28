package p1;

public class Selection
{
	public void select(int n,String name)
	{
		if(n<=Avalaible.av)
		{
			System.out.println(n+"tickets booked for"+name);
			Avalaible.av=Avalaible.av-n;
			
		}
		else {
			System.out.println("No tikents avalaible for"+name);
		}
	}

}
