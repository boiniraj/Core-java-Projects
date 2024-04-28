//when we have 0-parameter constructor from the PClass,then Compiler
//at compilation stage will add super()&#39; to the CClass-constructor
//and which is PClass Con_call.

package p1;
public class Cclass extends Pclass 
{
	public int v;
	public Cclass(int v)
	{
		super(v);
	}

}
