/*wap to read StuRollNo and StuBranch?

Condition:
(i)rollNo must be 10 digits(AlphaNumeric)
(ii)Branch must be in CSE or ECE or EEE
(iii)rollNo must belong to the branch the Student Selected.*/

package p1;
public class CheckBracnch
{
	boolean z;
	public boolean verify(String br)
	{
		switch(br)
		{
		case "CSE":z=true;
			break;
		case "ECE": z=true;
		    break;
		case "EEE":z=true;
			break;
		}//end of switch
		return z;
	}
}
