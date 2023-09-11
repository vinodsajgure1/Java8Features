package com.example.defaultMethod;

public class DefaultMethodExample implements Sayable {


	@Override
	public void sayMore(String msg) {

		System.out.println(msg);
	}
	
	public static void main(String[] args) {

		DefaultMethodExample dm = new DefaultMethodExample();
		dm.say();  // calling Default method
		
		dm.sayMore("Abstract method called."); // calling abstract method.
		
		Sayable.sayLouder("Static method Called."); // calling static method.
	}

}
