package designpattern;

public class RedshapeDecorator extends ShapeDecrator
{
	
	public RedshapeDecorator(Shape DecoratedShape)
	{
		super(DecoratedShape);
	}
	
	public void draw()
	{
		Decoratedshape.draw();
		setRedBorder(Decoratedshape);
	}

	private void setRedBorder(Shape decoratedshape) {
		// TODO Auto-generated method stub
	System.out.println("Border color :red");	
	}
	

}
