package sep23rd;

public class AbstractDemo1 {

	public static void main(String[] args) {
		
		
		//  new Numbers();
		
		Numbers obj= new Addition();
		
		obj.compute(20, 10);
		obj.greet();
		
		Numbers obj2=new Subraction();
		
		obj2.compute(20, 10);
		
		obj2.greet();
		
		obj2.bye();

	}

}
