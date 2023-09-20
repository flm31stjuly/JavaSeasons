package assignments;

public class SimpleInterest {
	
	public static void main(String[] args) {
		
		SimpleInterest obj=new SimpleInterest();
		
		obj.calculateSimpleInterest(1000, 12, 0.5);
		
	}
	
	void calculateSimpleInterest(int p,int t,double r)
	{
		double si=(p*t*r)/100;
		System.out.println(si);
	}

}
