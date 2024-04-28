//InnerClases in Interface

package p1;
public interface ITest 
{
	public static class Subclass
	{
		public void m1(int a)
		{
			System.out.println("***Innerclasses In Interface***");
			System.out.println("The value a:"+a);
		}
		
	}//inner class

}//outer interface
