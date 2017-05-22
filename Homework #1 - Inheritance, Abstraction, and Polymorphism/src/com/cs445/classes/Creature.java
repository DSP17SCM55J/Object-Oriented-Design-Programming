package com.cs445.classes;

public abstract class Creature extends Thing {
	
	Thing eatObject= null;
	public Creature(String name) {
		super(name);
		super.toString();
		// TODO Auto-generated constructor stub
	}

	public void eat(Thing athing){
		eatObject = athing;
		System.out.println(super.name+" "+getClass().getSimpleName()+" has just eaten a "+athing.toString());
	}
	
	public abstract void move();
	
	public void whatDidYouEat(){
		
		if(eatObject==null){
			System.out.println(super.name+" "+getClass().getSimpleName()+" has had nothing to eat");
		}
		else{
			System.out.println(super.name+" "+getClass().getSimpleName()+" has eaten a "+eatObject.toString());
		}
	}
}
