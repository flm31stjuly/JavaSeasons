package assignments;

public class SimpleInterest2 {
	
	public static void main(String[] args) {
		
		SimpleInterest2 obj=new SimpleInterest2();
		
		System.out.println(obj.calculateSimpleInterest(1000, 12, 0.5));
		
	}
	
	double  calculateSimpleInterest(int p,int t,double r)
	{
		double si=(p*t*r)/100;
		
		return si;
	}

}
