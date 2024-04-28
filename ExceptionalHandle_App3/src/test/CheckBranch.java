//UserDefined CheckedException
package test;
@SuppressWarnings("serial")
public class CheckBranch extends Exception//extends Exception keyword
{
	public CheckBranch(String msg)//constructor
	{
		super(msg);//parent class	
	}
	public void chek(String br)throws CheckBranch//Add"throws" keyword to user defined method signature and
	                                               //raise the exception at method_call
	{
		try {
		switch(br)
		{
		case "CSE":
			break;
		case "ECE":
			break;
		case"EEE":
			break;
			default:
				CheckBranch ob=new CheckBranch("Invalid branch");//class object creation
				throw ob;//throw the catch block
		}//end of switch
		
		}//end try
		catch(CheckBranch ob)
		{
			throw ob;//Exception re-throwing process
			//use 'throw' keyword in catch-block and perform exception
			//re-throwing process
		}
		
	}

}
