package com.cs445.classes;

public class Ant extends Creature {
String name;
	public Ant(String name) {
		super(name);
		super.toString();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(super.name+" "+getClass().getSimpleName()+" is crawling around.");
		
	}

	
}
