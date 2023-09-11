package com.example.defaultMethod;

public interface Sayable {
	
	// Default method
	default void say() {
		System.out.println("This is default method");
	}
	
	// abstract method
	void sayMore(String msg);
	
	// static method
	
	static void sayLouder(String msg) {
		System.out.println(msg);
	}

}
