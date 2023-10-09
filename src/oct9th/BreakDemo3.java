package oct9th;

public class BreakDemo3 {

	public static void main(String[] args) {
	
		
		label: for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(j==5)
				{
					System.out.println("inside loop , before break ");
					break label;
					//System.out.println("inside loop , after break ");
				}
				System.out.println(i+"    "+j);
			}
		}

	}

}
