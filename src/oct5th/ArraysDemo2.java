package oct5th;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		int[] a=new int[10];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		a[3]=400;
		
		a[9]=1000;
		
		for(int temp:a)
		{
			System.out.println(temp);
		}

	}

}
