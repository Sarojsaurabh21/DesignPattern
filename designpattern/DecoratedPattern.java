package designpattern;

public class DecoratedPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape Circle=new Circle();
		Shape redCircle=new RedshapeDecorator(new Circle());
		
		Shape rectangle= new Rectangle();
		Shape redTReactangle=new RedshapeDecorator(new Rectangle());
		
		System.out.println("Circle with noraml border");
		Circle.draw();
		
		
		System.out.println("Circle with redborder border");
		redCircle.draw();
		redTReactangle.draw();
		
		
	}

}
