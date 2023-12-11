package com.java_part;
public class Employees {
	String name;
	double pf;
	double hra;
	double da;
	double incentives;
	double salary;
	String type;
	
	

	public Employees(String name, double pf, double hra, double da, double incentives ) {
		this.name = name;
		this.pf = pf;
		this.hra = hra;
		this.da = da;
		this.incentives = incentives;
		
	}
	public Employees(String name, double pf, double hra,  double incentives ) {
		this.name = name;
		this.pf = pf;
		this.hra = hra;
		this.incentives = incentives;
	}
	public Employees(String name, double pf, double hra) {
		this.name = name;
		this.pf = pf;
		this.hra = hra;
	}

	void printSalary()
	{
		salary=pf+hra+da+incentives+da;
		System.out.println(salary);
	}
	




	public static void main(String[] args) {
		
		Employees obj=new Employees("sathwik",20000,20000);
		obj.printSalary();
		// TODO Auto-generated method stub

	}

}
