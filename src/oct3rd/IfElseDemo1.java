package oct3rd;

public class IfElseDemo1 {

	public static void main(String[] args) {
	
		int sal=20000;
		
		
		
		/* if(sal<=30000) { sal=sal+(sal*20)/100; } else { sal=sal+(sal*30)/100; } */
		
		 //  System.out.println(sal<=30000?"Net Salary "+(sal+(sal*20))/100:"Net Salary "+(sal+(sal*30)/100));
		 
	    int res=sal<=30000?sal+(sal*20)/100:sal+(sal*30)/100;
	    
	    System.out.println("Net Salary "+res);
		
		

	}

}
