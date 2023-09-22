package sep22nd;

public class Add extends Numbers {
	
	private int x,y;
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}
	

	public void setY(int y) {
		this.y = y;
	}



	public void add()
	{
		System.out.println("Sum is "+(x+y));
	}
	

}
