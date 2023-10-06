package oct6th;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {


		List<String> al=new ArrayList<String>();
		
		al.add("FLM");
		al.add("Java");
		al.add("Python");
		al.add("Selenium");
		al.add("Automation");
		System.out.println("Size "+al.size());
		al.add("FLM1");
		al.add("Java1");
		al.add("Python1");
		al.add("Selenium1");
		al.add("Automation1");
		System.out.println("Size "+al.size());
		
		Iterator<String> it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(al.get(3));
		al.remove(3);
		System.out.println(al.get(3));

	}

}
