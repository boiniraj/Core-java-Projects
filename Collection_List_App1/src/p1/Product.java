package p1;
@SuppressWarnings("rawtypes")
public class Product extends Object implements Comparable
{
  public String code,name;
  public float price;
  public int qty;
  public Product(String code,String name,float price,int qty)
  {
	  this.code=code;
	  this.name=name;
	  this.price=price;
	  this.qty=qty;
  }
  public String toString()
  {
	  return code+"\t"+name+"\n\t1"+price+"\n\t2"+qty;
  }
  public int compareTo(Object o)
  {
	  Product p=(Product)o;
	  int z=code.compareTo(p.code);
	  if(z==0) return 0;
	  else if(z>0) return -1;
	  else return -1;
	  
}
}
