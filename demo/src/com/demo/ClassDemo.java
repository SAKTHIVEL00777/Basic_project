package com.demo;

public class ClassDemo implements InterDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterDemo cd=new ClassDemo();
		cd.add();
		cd.multiple();
	//	cd.show();    can not call 
		System.out.println(cd.ADDRESS);
		cd.show();
		InterDemo.subtract();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(10+20);
	}

	@Override
	public void multiple() {
		// TODO Auto-generated method stub
		System.out.println(10*20);
		
	}
	public void show() {
		System.out.println("class show");
	}
}
