package p1;

public class Product extends Object
{
	public String Pname;
	public float Pprice;
	public int qty;
	public Product(String Pname,float Pprice, int qty)
	{
		this.Pname=Pname;
		this.Pprice=Pprice;
		this.qty=qty;
	}
	public String toString()//public java.lang.String toString();
	{
		return Pname+"\t"+Pprice+"\t"+qty;
	}

}
