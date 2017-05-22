package com.cs445.classes;

public abstract class Creature extends Thing {
	
	Thing eatObject= null;
	public Creature(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void eat(Thing athing){
		eatObject = athing;
		System.out.println(this+"has just eaten a"+athing.toString());
	}
	
	public abstract void move();
	
	public void whatDidYouEat(){
		
		if(eatObject==null){
			System.out.println(this.toString()+"has had nothing to eat");
		}
		else{
			System.out.println(this.getClass()+"has eaten a "+eatObject.toString());
		}
	}
}
