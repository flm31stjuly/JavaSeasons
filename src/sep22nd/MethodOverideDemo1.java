package sep22nd;

public class MethodOverideDemo1 {

	public static void main(String[] args) {
		
		//One obj1=new One();
		//Two obj1=new Two();
		
		//case 1
		//One obj1=new One();
		
		//case 2
		//Two obj1=new Two();
		
		//case 3 - Invalid
		
		//Two obj1=new One();
		
		//case 4
		
		One obj1=new Two();
		
		obj1.greet("John");
		obj1.bye();

	}

}
