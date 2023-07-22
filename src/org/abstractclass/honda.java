package org.abstractclass;

public class honda extends Bike {
	//abstract method
	public void biketest() {
		
		System.out.println("abstract sub class can implement the method but abstract method cannot");

	}

	public void withdraw() {
		//abstract class with normal method data displayed 
		super.withdraw();
		System.out.println("abstract sub class can use parent class method and add more information");
	}
	public static void main(String[] args)
	{
		// we can call parent class name and child class on
		//1.Bike b=new honda;
		// 2.bike a; bike =new honda;
		
	Bike b=new honda();
	//question 
	//System.out.println("sample test:"+b.biketest());
		b.biketest();
		b.withdraw();
	}

}
