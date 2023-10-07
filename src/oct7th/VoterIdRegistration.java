package oct7th;

import java.util.Scanner;

public class VoterIdRegistration {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Voter Registration System...");
		
		System.out.println("Please enter your age :");
		
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are elegible for voting ..please proceed ..");
		}
		else
		{
			try
			{
			throw new InvalidAgeException();
			}
			catch(InvalidAgeException  e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		

		System.out.println("end of program..");
	}

}
