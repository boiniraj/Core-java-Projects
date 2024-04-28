//This is Late Instantiation process
//late instantiation process.object created Method
//In real time,SingleTon class design pattern&#39; is used in DAO(Data AccessObject)Layer of MVC(Model View Controller) Architectures.
package p1;
public class Lclass 
{
  private static Lclass ob;
  private Lclass() {}
  public static Lclass getRef()
  {
	  if(ob==null)//late instantiation process.object created Method
	  {
		  ob=new Lclass();
	  }
	  return ob;
  }
  public void dis(int L)
  {
	  System.out.println("The value L:"+L);
  }
}
