package p2;
import java.util.*;
public class StringJoiner1
{
	public static void main(String[] args)
	{
		System.out.println("====ob1====");
		StringJoiner ob1=new StringJoiner("/");
		ob1.setEmptyValue("User Joining date not Avalaible.......");
		System.out.println("Date in ob1:"+ob1.toString());
		ob1.add("10");
		ob1.add("02");
		ob1.add("2000");
		System.out.println("===Show the date===");
		System.out.println(ob1.toString());
		StringJoiner ob2=new StringJoiner("-");
		System.out.println("====Show the Address====");
		ob2.add("Dammannapet");
		ob2.add("Regonda");
		ob2.add("Bhupalapally");
		System.out.println(ob2.toString());
		System.out.println("===Merge===");
		ob1.merge(ob2);
		System.out.println(" Data in ob1:"+ob1.toString());
		System.out.println("length of ob1:"+ob1.length());

	}

}
