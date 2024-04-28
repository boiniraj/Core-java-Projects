package test;
import java.util.*;
import test.BookDetails;
public class DemoArray3 
{
	public static void main(String[] args)
	{
		Object o[]=new Object[3]; 
		/* =>;The Array which is declared with java.lang.Object class is known as Object
Array.

=>Object-Array can hold dis-similer objects,which mean objects generated from
different classes.
syntax:
Object o[] = new Object[size];*/
		o[0]=new Integer(12);
		o[1]=new String("book");
		o[2]=new BookDetails("A211","Sql","sudha",1200,3);
		Spliterator<Object> sp=Arrays.spliterator(o);
		sp.forEachRemaining((k)->
		{
			System.out.println("Object:"+k.toString());
		}
				);
		
	}

}
