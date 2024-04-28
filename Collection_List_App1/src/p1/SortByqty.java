package p1;
import java.util.*;
@SuppressWarnings("rawtypes")
public class SortByqty implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Product1 b1=(Product1)o1;
		Product1 b2=(Product1)o2;
		if(b1.qty==b2.qty) return 0;
		else if(b1.qty>b2.qty) return 1;
		else  return -1;
		
	}

}
