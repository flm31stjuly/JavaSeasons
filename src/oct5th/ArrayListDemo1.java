package oct5th;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		
		
		System.out.println(al.size());
		
		al.add(10);
		
		al.add(20.33);
		
		al.add("FLM");
		
		al.add('C');
		
		al.add(10);
		
		al.add(20.33);
		
		al.add("FLM");
		
		al.add('C');
		
		al.add(10);
		
		al.add(20.33);
		
		al.add("FLM");
		
		al.add('C');
		
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for(Object temp:al)
		{
			System.out.println(temp);
		}
		
		 System.out.println(al.contains("FLM"));
		

	}

}
