package designpattern;

public class SingleobjectDemo1 {
	
	private static SingleobjectDemo1 instance =new SingleobjectDemo1();
	SingleobjectDemo1()
	{
		
	}
	
	public static SingleobjectDemo1 getinstance()
	{
		return instance;
		
	}
	public void showMessage()
	{
		System.out.println("hello");
	}
	

}
