package p1;

public class Cclass extends Pclass
{
  public void m(int a,int b,int c)
  {
	  super.m(a,b);
	  System.out.println("c:"+c);
  }
  public void m(int a,int b,int c,int d)
  {
	  this.m(a,b,c);
	  System.out.println("d:"+d);
  }
}
