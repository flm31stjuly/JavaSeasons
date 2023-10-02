package oct2nd;

import java.util.Scanner;

public class OperatorsDemo4 {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter some value of x :  ");
		// x in between 0 and 10
		
		// x>=0  and x<=10
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		
		/*if(x>=0 || x<=10)
		{
			System.out.println("x is within our range");
		}*/
		
		if(!(x>=0))
		{
			System.out.println("x is within our range");
		}
		else
		{
			System.out.println("x is not in our range");
		}
		
		
		
		
		
		
		

	}

}
