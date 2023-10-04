package oct4th;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		
		ForLoopDemo2.natSum(100);
		
	}
	private static void natSum(int num) {
		
		int res=0;
		
		for(int i=1;i<=num;i++)
		{
			res=res+i;
		}
		
		System.out.println("Sum of "+num+" natural numbers "+res);
		
	}

}
