//pre-defined checkedException

package macces;
public class DemoException3
{
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public static void main(String args[]) throws ClassNotFoundException,InstantiationException,IllegalAccessException
	{
		Class c=Class.forName("test.Display");
		test.Display ob=(test.Display)c.newInstance();
		ob.dis(12);
		
	}

}
