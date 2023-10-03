package oct3rd;

import java.util.Scanner;

public class SwithDemo1 {

	public static void main(String[] args) {
		System.out.println("Enter Date :  ");

		Scanner input = new Scanner(System.in);

		int date = input.nextInt();

		System.out.println("Enter  Month (1 -12) :  ");
		int mon = input.nextInt();

		System.out.println("Enter  year :  ");
		int year = input.nextInt();

		// 2 10 1869 02-OCT-1869

		String month = null;
		
		//long x=9848022338l;
		
		//boolean status = true;
		
		//float y=3.14f;
		
		//double 
		
		char ch='a';

		switch (ch) {
		case 1:
			month = "JAN";
			break;
		case 2:
			month = "FEB";
			break;
		case 3:
			month = "MAR";
			break;
		case 4:
			month = "APR";
			break;
		case 5:
			month = "MAY";
			break;
		case 6:
			month = "JUN";
			break;
		case 7:
			month = "JUL";
			break;
		case 8:
			month = "AUG";
			break;
		case 9:
			month = "SEP";
			break;
		case 10:
			month = "OCT";
			break;
		case 11:
			month = "NOV";
			break;
		case 12:
			month = "DEC";
			break;
		default: System.out.println("Invalid month");
		}

		System.out.format("Date of Birth is : %02d-%s-%04d", date, month, year);

	}

}
