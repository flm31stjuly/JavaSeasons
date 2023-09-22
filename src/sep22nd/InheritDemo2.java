package sep22nd;

public class InheritDemo2 {

	public static void main(String[] args) {
		
		Add obj1=new Add();
		//Sub obj1=new Sub();
		//Mul obj1=new Mul();
		//Div obj1=new Div();
		obj1.setX(20);
		//System.out.println(obj1.x);
		System.out.println(obj1.getX());
		obj1.setY(10);
		obj1.add();
		//obj1.diff();
		//obj1.prod();
		//obj1.quot();

	}

}
