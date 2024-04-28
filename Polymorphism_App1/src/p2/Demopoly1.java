package p2;
import p1.PDisplay;
public class Demopoly1 {

	public static void main(String[] args)
	{
		//Creates an instance of PDisplay using the getRef() method. PDisplay ob2 = PDisplay.getRef();
		PDisplay ob2= PDisplay.getRef();
		//It creates an instance of PDisplay using the getRef() method and calls the access() method on that instance.
		ob2.access();
        }
	//Here, ob2 is assigned the instance of PDisplay returned by the getRef() method, and then various methods of the PDisplay class, like access(), can be called on this instance.
}
//In the Demopoly1 class in the p2 package:

//Imports the PDisplay class from the p1 package.
//Calls the getRef() method to obtain an instance of PDisplay.
//Calls the access() method on the obtained instance to demonstrate the functionality of various components.

