package org.rgit.prog1;

public class Prgm {
	
	float num1=10,num2=20,result;
	
	public void add() {
		
		result=num1+num2;
		System.out.println("The sum of two numbers is : "+result);
		
	}
	public void sub() {
		
		result=num1-num2;
		System.out.println("The difference of teo numbers is : "+result);
		
	}
	public void mul() {
		
		result=num1*num2;
		System.out.println("The product of two numbers is : "+result);
		
	}
	public void div() {
		
		result=num1/num2;
		System.out.println("The division of two numbers is : "+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Prgm obj=new Prgm();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}

}
