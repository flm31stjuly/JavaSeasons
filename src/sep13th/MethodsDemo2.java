package sep13th;

public class MethodsDemo2 {

	public static void main(String[] args) {
		
		MethodsDemo2 obj=new MethodsDemo2();
		obj.natSum(5);
		obj.natSum(10);
		obj.natSum(100);
		obj.natSum(1000);
	}
	
	public void natSum(int n)
	{
		int res=n*(n+1)/2;
		System.out.println("Sum of "+n+" Natural Numbers is : "+res);
	}

}
