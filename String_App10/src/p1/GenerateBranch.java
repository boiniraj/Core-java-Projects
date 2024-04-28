package p1;
public class GenerateBranch
{
	public String gBr;
	public String generate(String brCode)
	{
		switch(brCode)
		{
		case "05":gBr="CSE";
		break;
		case "04":gBr="ECE";
		break;
		case "03":gBr="EEE";
		break;
		default:gBr=null;
		}//end of switch
		return gBr;
	}

}
