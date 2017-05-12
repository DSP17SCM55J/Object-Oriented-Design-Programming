package com.cs445.classes;

public class Bat extends Creature implements Flyer{
String name;
	public Bat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		fly();
	}
	public void fly(){
		System.out.println(name+" "+this.getClass()+" is swooping through the dark.");
	}
	
	

}
