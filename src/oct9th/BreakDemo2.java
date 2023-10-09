package oct9th;

public class BreakDemo2 {

	public static void main(String[] args) {
	
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(j==5)
				{
					System.out.println("inside loop , before break ");
					break;
					//System.out.println("inside loop , after break ");
				}
				System.out.println(i+"    "+j);
			}
		}

	}

}
