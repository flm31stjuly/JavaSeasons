package oct3rd;

import java.util.Scanner;

public class IfElseDemo5 {

	public static void main(String[] args) {
		
		System.out.println("Enter Date :  ");
		
		
		
		Scanner input=new Scanner(System.in);
		
		int date=input.nextInt();
		
		System.out.println("Enter  Month (1 -12) :  ");
		int mon=input.nextInt();
		
		System.out.println("Enter  year :  ");
		int year=input.nextInt();
		
		// 2  10 1869   02-OCT-1869
		
		String month=null;
		
		if(mon == 1)
		{
			month="JAN";
		}
		else if(mon == 2)
		{
			month="FEB";
		}
		else if(mon == 3)
		{
			month="MAR";
		}
		else if(mon == 4)
		{
			month="APR";
		}
		else if(mon == 5)
		{
			month="MAY";
		}
		else if(mon == 6)
		{
			month="JUN";
		}
		else if(mon == 7)
		{
			month="JUL";
		}
		else if(mon == 8)
		{
			month="AUG";
		}
		else if(mon == 9)
		{
			month="SEP";
		}
		else if(mon == 10)
		{
			month="OCT";
		}
		else if(mon == 11)
		{
			month="NOV";
		}
		else if(mon == 12)
		{
			month="DEC";
		}
		
		
		System.out.format("Date of Birth is : %02d-%s-%04d",date,month,year);

	}

}
