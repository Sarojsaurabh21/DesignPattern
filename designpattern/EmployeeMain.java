package designpattern;

import Array.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name");
         String name=sc.nextInt();
         System.out.println("enter the address");
         String address=sc.nextInt();
         System.out.println("enter the salary");
         float salary=sc.nextInt();
         
         Emplyoee e1=new Emplyoee(id,name,address,salary);
         e1.display();
         e1.getClone();
         
	}

}
