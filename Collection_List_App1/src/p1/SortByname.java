package p1;
import java.util.*;
@SuppressWarnings("rawtypes")
public class SortByname implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Product1 b1=(Product1)o1;
		Product1 b2=(Product1)o2;
		int z=b1.name.compareTo(b2.name);
		if(z==0) return 0;
		else if(z>1) return 1;
		else return -1;
		
	}


}
