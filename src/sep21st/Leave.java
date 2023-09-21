package sep21st;

public class Leave extends Marks{
	
	int sl,cl;
	
	public void setLeave(int sl,int cl)
	{
		this.sl=sl;
		this.cl=cl;
	}
	
	public void getLeaves()
	{
		System.out.println("Total No of Leaves taken : "+(sl+cl));
	}

}
