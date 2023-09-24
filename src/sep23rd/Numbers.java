package sep23rd;

public abstract class Numbers {
	
	public Numbers()
	{
		System.out.println("In Numbers Constructor ...");
	}
	
	//abstract method
	public abstract void compute(int x,int y);  // idea and  No implementation
	
	//concrete or normal method
	
	public void greet() // idea and  implementation
	{
		System.out.println("Good Morning ...");
	}
	
	//abstract method
	public abstract void bye(); // idea and  No implementation
	
	

}
