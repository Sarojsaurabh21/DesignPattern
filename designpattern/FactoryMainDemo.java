package designpattern;

import java.util.Scanner;

public class FactoryMainDemo {

	public static  void main(String[] args, String planName) {
		
  GetPlanFactory g=new GetPlanFactory();
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no.of units for bill will be calculated");
  
  int units=sc.nextInt();
  
  Plan p=g.getPlan(planName);
  System.out.println("Bill amont for "+planName+"of"+units+" units is:");
  p.getRate();
  p.calculateBill(20);
	}

}
