package oct5th;

public class ArraysDemo4 {

	public static void main(String[] args) {
		

		int[][]  a=new int[2][5];
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" \t");
			}
			System.out.println();
		}
		
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[0][3]=4;
		a[0][4]=5;
		
		for(int j=0;j<a[1].length;j++)
		{
			//a[1][j]=a[0][j]*a[0][j];
			
			a[1][j]=(int)Math.pow(a[0][j],3);
			
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" \t");
			}
			System.out.println();
		}

	}

}
