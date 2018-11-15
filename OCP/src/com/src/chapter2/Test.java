package com.src.chapter2;

import java.util.function.Predicate;

public class Test {

	
	public static void main(String args[]){
		
		//CheckTrait ct;
		Predicate<Animal> ct;
		ct = (b) -> { return b.canSwim(); };
		
		Animal a = new Animal("felino", false, true);
		System.out.println(ct.test( a ));
	}
	
}
