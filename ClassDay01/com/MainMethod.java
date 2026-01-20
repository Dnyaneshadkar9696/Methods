package com;

import methodpractise.Addition;
import methodpractise.Age;
import methodpractise.Name;

public class MainMethod {
	
	public static void main(String[] args) {
		Name nm = new Name();
		System.out.print("1) ");
		nm.myName();
		
		System.out.println();
		System.out.print("2) ");
		Addition ad = new Addition();
		ad.add(5, 10);
		
		// calling age
		System.out.println();
		System.out.print("3) ");
		Age ag = new Age();
		ag.myAge();
		
	}

}
