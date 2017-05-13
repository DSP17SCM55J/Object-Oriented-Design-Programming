package com.cs445.classes;

public class Tiger extends Creature{
	
	String name;
	public Tiger(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(name+" "+this.getClass()+" has just pounced.");
		
	}

}
