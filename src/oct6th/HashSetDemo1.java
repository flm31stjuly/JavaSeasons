package oct6th;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		System.out.println(hs.size());
		
		hs.add("FLM");
		hs.add("Java");
		hs.add("Python");
		hs.add("Selenium");
		hs.add("Automation");
		
		
		System.out.println("FLM".hashCode());
		System.out.println("Java".hashCode());
		System.out.println("Python".hashCode());
		System.out.println("Selenium".hashCode());
		System.out.println("Automation".hashCode());

		
		System.out.println("FLM".hashCode()%16);
		System.out.println("Java".hashCode()%16);
		System.out.println("Python".hashCode()%16);
		System.out.println("Selenium".hashCode()%16);
		System.out.println("Automation".hashCode()%16);
		
		//System.out.println(hs.size());
		
		
		/*
		 * hs.add("FLM"); hs.add("Java"); hs.add("Python"); hs.add("Selenium");
		 * hs.add("Automation");
		 */
		//System.out.println(hs.size());
		
		
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		Iterator<String> it=hs.iterator();
		
		String x=null;
		while(it.hasNext())
		{
			x=it.next();
			System.out.println(x);
		}
		

	}

}
