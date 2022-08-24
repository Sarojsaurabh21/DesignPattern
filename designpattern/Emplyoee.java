package designpattern;

import Acessspecifier.Employee;

public class Emplyoee implements ProtoType
{
	private int id;
	private String name;
	private String address;
	private float salary;
	
	public Emplyoee()
	{
		System.out.println(id+name+address+salary);
	}
	
	public Emplyoee(int id, String name, String address, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	
	public void display()
	{
		System.out.println(id+name+address+salary);
	}
	@Override
	public ProtoType getClone() {
		// TODO Auto-generated method stub
		return new Emplyoee(id,name,address,salary);
	}

}
