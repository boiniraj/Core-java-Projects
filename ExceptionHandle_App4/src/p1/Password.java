package p1;
@SuppressWarnings("serial")
public class Password extends Exception
{
	public Password()
	{
		super();
	}
	public Password(String msg)
	{
		super(msg);
	}
	
	public boolean validatePassword(String pass)throws Password
	{
		try 
		{
			if(pass.length()<8 ||
			   pass.contains("")||
			   !pass.matches(".*[A-Z].*") ||
               !pass.matches(".*[a-z].*[a-z].*") ||
               !pass.matches(".*[@#$%^&*()_+\\[\\]{}|;:,.<>?0-9].*") ||
               pass.replaceAll("[^a-z]", "").length() <= pass.replaceAll("[^A-Z]", "").length())
			{
				Password ob=new Password("WrongPasswordException");
				 throw ob;
				 
			}
			
			return true;
			
			
				
		}//end of try
		catch(Password ob)
		{
			
			throw ob;
			
			
			
			
		}
		
		
	}
	

}
