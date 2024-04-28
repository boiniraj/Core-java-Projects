package p1;
public enum Books
{
	CoreJava(1200),Advjava(1500),Spring(1700),Hibernet(1800),WebServies(1200);//elements
	public int price;//variable
	private Books(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}

}
