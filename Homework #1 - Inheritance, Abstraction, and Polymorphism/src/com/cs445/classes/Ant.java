package com.cs445.classes;

public class Ant extends Creature {
String name;
	public Ant(String name) {
		super(name);
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(name+" "+this.getClass()+" is crawling around.");
		
	}

	
}
