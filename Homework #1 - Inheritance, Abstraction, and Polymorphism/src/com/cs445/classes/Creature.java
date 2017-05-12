package com.cs445.classes;

public abstract class Creature extends Thing {
	
	public Creature(String name){
		
	}
	
	public void eat(Thing athing){
		
		System.out.println("");
	}
	
	public abstract void move();
	
	public void whatDidYouEat(){
		
	}
}
