package oct4th;

import java.util.Scanner;

public class WhileDemo2 {
	
	
	public static void main(String[] args) {
		
		boolean status=true;
		while(status)
		{
			System.out.println("Enter some character : ");
			Scanner input=new Scanner(System.in);
			char ch=input.next().charAt(0);
			
			if(ch != 'x' )
			{
				System.out.println("you have entered "+ch);
				status=true;
			}
			else
			{
				System.out.println("Exiting the loop");
				status=false;
			}
		}
		
	}

}
