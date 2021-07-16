package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDependecyImplement implements MyBeanWithDependecy{
	
	
private MyOperation myOperation;
	
	public MyBeanWithDependecyImplement (MyOperation myOperation) {
		this.myOperation = myOperation;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printWithDependecy() {
		// TODO Auto-generated method stub
		System.out.print(myOperation.sum(2));
		System.out.print("Hola desde mi depenecia");
	}

}
