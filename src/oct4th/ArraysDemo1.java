package oct4th;

public class ArraysDemo1 {

	public static void main(String[] args) {
		
		
		//method 1
		
		int[] a= {10,20,30,40,50};
		
		System.out.println(a.length);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		for(int temp:a)
		{
			System.out.println(temp);
		}

	}

}
