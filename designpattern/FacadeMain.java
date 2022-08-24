package designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeMain {

	private static String s1;


	public static void main(String[] args) throws IOException {
	
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the choice");
	String choice=reader.readLine();
	ShopKeeper s=new ShopKeeper();
	
		 
	System.out.println(" this is iphone ");
		    s.iphoneSal();
		    
		
		 System.out.println("this is a samsung");
		    s.samsungSal();
		    
		
		  System.out.println("this is a blackberry");
		    s.blackBerrysal();
		    
	
	
	
	}

	}
	

