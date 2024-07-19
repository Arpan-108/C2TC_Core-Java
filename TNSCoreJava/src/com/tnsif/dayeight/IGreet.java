//Program to define Functional Interface IGreet
package com.tnsif.dayeight;

@FunctionalInterface
public interface IGreet {
	String sayHello(String name);
	// Functional interface must have only one Method
}
