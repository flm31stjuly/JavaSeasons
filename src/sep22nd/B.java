package sep22nd;

public class B extends A{
	
	int x;
	
	public void put(int x)
	{
		this.x=x;
	}
	
	public void showAll()
	{
		System.out.println("x is "+super.x);
		System.out.println("x is "+this.x);
	}

}
