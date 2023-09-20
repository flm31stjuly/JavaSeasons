package sep14th;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		MethodsDemo3.natSum(5);
		MethodsDemo3.natSum(10);
		MethodsDemo3.natSum(100);
		MethodsDemo3.natSum(1000);
		
	}
	
	static void natSum(int n)
	{
		int res=n*(n+1)/2;
		System.out.println(res);
	}

}
