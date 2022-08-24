package designpattern;

public  abstract class ShapeDecrator implements Shape
{
 Shape Decoratedshape;

public ShapeDecrator(Shape Decoratedshape) {
	super();
	this.Decoratedshape = Decoratedshape;
}
public void draw()
{
	Decoratedshape.draw();
}
 
 
}
