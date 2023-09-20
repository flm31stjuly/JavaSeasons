package assignments;

public class SimpleInterest3 {
	
	public static void main(String[] args) {
		
		SimpleInterest3 obj=new SimpleInterest3();
		
		System.out.println(obj.calculateSimpleInterest(1000, 12, 0.5));
		
	}
	
	double  calculateSimpleInterest(int p,int t,double r)
	{
		return (p*t*r)/100;
	}

}
