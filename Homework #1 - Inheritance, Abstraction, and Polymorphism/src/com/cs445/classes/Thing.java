package com.cs445.classes;

public class Thing {
	String name;
	public Thing(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public String toString(){
		
		if((this.getClass().getSimpleName()).equalsIgnoreCase("Thing")){
		return name;
			
		}
		else{
			String className = getClass().getSimpleName();
			return name + " " + className;
		}
	}
}
