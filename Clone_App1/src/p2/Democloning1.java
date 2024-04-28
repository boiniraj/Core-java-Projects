//Demonstrating of Shallow Cloning process

package p2;
import java.util.*;
import p1.*;
public class Democloning1 extends Object implements Cloneable
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	try(s;)
	{
	Employe ob1=new Employe();
	System.out.println("Enter the Id: ");
	    ob1.id=s.nextLine();
	    System.out.println("Enter the Name:");
	    ob1.name=s.nextLine();
	    System.out.println("Enter the city:");
	    ob1.ad.city=s.nextLine();
	    System.out.println("Enter the State:");
	    ob1.ad.state=s.nextLine();
	    System.out.println("***Orginal Object***");
	    System.out.println(ob1.toString());
	    System.out.println(ob1.ad.toString());
	    System.out.println("Hashcode of Employee Object:"+ob1.hashCode());
	    System.out.println("HashCode of Address Object:"+ob1.ad.hashCode());
	    //Clonning
	    Employe ob2=(Employe)ob1.getRef1(); 
	    System.out.println("***Duplicate Object***");
	    System.out.println(ob2.toString());
	    System.out.println(ob2.ad.toString());
	    System.out.println("HashCode of Employe Object:"+ob2.hashCode());
	    System.out.println("HashCode of Adress Object:"+ob2.ad.hashCode());
}catch(Exception e)
{
	e.printStackTrace();
}
	    
	    
		

	}

}
