//Blocks from PClass/SuperClass
//In Inheritance process while Object creation &#39;PClass and CClass&#39;
//Static-blocks are executed first,and then InStance blocks are executed.

package p1;

public class Cclass extends Pclass 
{
	static 
	{
		System.out.println("**Cclass static block ***");
	}
	{
		System.out.println("***Cclass instance block***");
	}
}
