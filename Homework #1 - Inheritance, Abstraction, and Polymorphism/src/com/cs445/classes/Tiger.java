package com.cs445.classes;

public class Tiger extends Creature{
	
	String name;
	public Tiger(String name) {
		super(name);
		super.toString();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(super.name+" "+getClass().getSimpleName()+" has just pounced.");
		
	}

}
