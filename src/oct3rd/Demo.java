package oct3rd;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
System.out.println("Enter your Salary : ");
		
		Scanner input=new Scanner(System.in);
				
		int sal=input.nextInt();
		
		System.out.println("Enter your Dept : ");
		
		String dept=input.next();
		
		// <= 30000 20%
		// >30000 <=60000 30%
		// >60000 40%
		
		
			if(dept.equals("Non-IT"))
			sal=sal+(sal*10)/100;
			else 
			sal=sal+(sal*20)/100;
			
			System.out.println("Net Sal :  "+sal);
			
		}

	}

