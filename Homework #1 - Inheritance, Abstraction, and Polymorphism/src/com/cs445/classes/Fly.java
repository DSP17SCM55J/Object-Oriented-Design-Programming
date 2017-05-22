package com.cs445.classes;

public class Fly extends Creature implements Flyer{

	public Fly(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+" is buzzing around in flight");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		fly();
	}
	
	@Override
	public void eat(Thing aThing){
		if(aThing.getClass().getSimpleName().equalsIgnoreCase("Thing")){
			System.out.println(this+" has just eaten a "+aThing.toString());
		}
		else{
			System.out.println(this+" won't eat a "+aThing.toString());
		}
	}

}
