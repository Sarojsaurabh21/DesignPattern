package designpattern;

public abstract class Plan {  //this is we creating abstract methods plan,demostic,commercial,institude;==-planmainDemo
	protected double rate;
	
	abstract void getRate();
	
	public void calculateBill(int units)
	{
		System.out.println(units*rate);
	}
	

}
