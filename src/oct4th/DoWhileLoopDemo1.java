package oct4th;

import java.util.Scanner;

public class DoWhileLoopDemo1 {

	public static void main(String[] args) {
		
		int x=0;
		
		do
		{
			System.out.println("How many points you got in the game");
			
			Scanner  input=new Scanner(System.in);
			
			 x=input.nextInt();
			 
			 if(x!=0)
			 System.out.println("You have one more chance ");
			 else
				 System.out.println("NO more chance ..Game exit");
			
		}while(x>0);

	}

}
