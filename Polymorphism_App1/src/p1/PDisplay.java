package p1;

public class PDisplay
{
	private int k=10;//private variable 
	private static int j=20;//private static variable
	//There's a private constructor PDisplay(), making it not possible to create instances of this class directly.
	private  PDisplay() {}
	//private non-static method
	private void dis()
	{
		System.out.println("** private non-static dis()**");
		System.out.println("value:"+k);
		System.out.println("value:"+j);
	}
	//private static method
	private static void dis2()
	{
		System.out.println("private static m1()");
		//System.out.println("value:"k);
		System.out.println("Value:"+j);
	}
	//private inner class
	private class Subclass
	{
		public void m2()
		{
			System.out.println("**instance innerClass m2()**");
			System.out.println("The value:"+k);
			System.out.println("The value:"+j);
			
		}
	}
	//private static inner class
	private static class Subclass1
	{
		public void m3()
		{
			System.out.println("StaticInnerClass m3()");
			System.out.println("The value:"+j);
			//System.out.println("The Value:"+k);
		}
		
	}
	//public method to access various components
	public void access()
	{
		Subclass ob=new Subclass();
		Subclass1 ob1=new Subclass1();
	    System.out.println("**acces()**");
	    System.out.println("val k:"+k);
	    System.out.println("val j:"+j);
	    this.dis();//call private non-static method
	    PDisplay.dis2();//call private static method
	    ob.m2();//call method of private inner class 
	    ob1.m3();//call method private-static inner class  
	}
	//static method to obtain an instance of the class
	public static PDisplay getRef()//getRef() is a public static method that creates an instance of PDisplay and returns it. It allows obtaining an instance of PDisplay from outside the class.
	//The getRef() method is a static method that returns an instance of the PDisplay class.
//Definition of a public static method getRef() which creates and returns an instance of the PDisplay class.	
	{
		PDisplay ob2=new PDisplay();
		return ob2;
		
	}
	
	

}



/*Certainly! Let's go through the provided Java program line by line to understand its structure and functionality:

java
Copy code
// File: PDisplay.java
package p1;

public class PDisplay {
    private int k = 10;
    private static int j = 20;

    // Constructor
    public PDisplay() {}

    // Private non-static method
    private void dis() {
        System.out.println("** private non-static dis()**");
        System.out.println("value:" + k);
        System.out.println("value:" + j);
    }

    // Private static method
    private static void dis2() {
        System.out.println("private static m1()");
        // System.out.println("value:"k); // Commented out to avoid compilation error
        System.out.println("Value:" + j);
    }

    // Private inner class
    private class Subclass {
        public void m2() {
            System.out.println("**instance innerClass m2()**");
            System.out.println("The value:" + k);
            System.out.println("The value:" + j);
        }
    }

    // Public static inner class
    public static class Subclass1 {
        public void m3() {
            System.out.println("StaticInnerClass m3()");
            System.out.println("The value:" + j);
            // System.out.println("The Value:"+k); // Commented out to avoid compilation error
        }
    }

    // Public method to access various components
    public void access() {
        Subclass ob = new Subclass();
        Subclass1 ob1 = new Subclass1();
        System.out.println("**acces()**");
        System.out.println("val k:" + k);
        System.out.println("val j:" + j);
        this.dis();        // Call private non-static method
        PDisplay.dis2();   // Call private static method
        ob.m2();           // Call method of private inner class
        ob1.m3();          // Call method of public static inner class
    }

    // Static method to get an instance of PDisplay
    public static PDisplay getRef() {
        PDisplay ob2 = new PDisplay();
        return ob2;
    }
}
java
Copy code
// File: Demopoly1.java
package p2;

import p1.PDisplay;

public class Demopoly1 {

    public static void main(String[] args) {
        PDisplay ob2 = PDisplay.getRef(); // Get an instance of PDisplay using the static method
        ob2.access();                      // Call the access method to demonstrate various components
    }
}
/*Explanation:

The PDisplay class is defined in the p1 package and has private instance variable k and private static variable j.

The class has a default constructor (public PDisplay() {}).

It contains a private non-static method dis() and a private static method dis2().

There is a private inner class Subclass and a public static inner class Subclass1.

The access() method is a public method that demonstrates accessing various components of the PDisplay class:

Creates instances of Subclass and Subclass1.
Prints values of k and j.
Calls dis() method.
Calls dis2() method.
Calls m2() method of the inner class Subclass.
Calls m3() method of the inner class Subclass1.
//--The getRef() method is a static method that returns an instance of the PDisplay class.--//

In the Demopoly1 class in the p2 package:

Imports the PDisplay class from the p1 package.
Calls the getRef() method to obtain an instance of PDisplay.
Calls the access() method on the obtained instance to demonstrate the functionality of various components.*/


