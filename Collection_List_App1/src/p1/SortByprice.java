package p1;
import java.util.*;
@SuppressWarnings("rawtypes")
public class SortByprice implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Product1 b1=(Product1)o1;
		Product1 b2=(Product1)o2;
		if(b1.price==b2.price) return 0;
		else if(b1.price>b2.price) return 1;
		else return -1;
		
	}

}
