package com.cs445.classes;

public class TestCreature extends java.lang.Object {

	public static int CREATURE_COUNT =6 ;
	public static int THING_COUNT = 10 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Creature[] cr = new Creature[6];
		Thing[] thing1 = new Thing[THING_COUNT];
		thing1[0]= new Thing("Banana");
		thing1[1] = new Thing("meat");
		thing1[2]=new Thing("kite");
		thing1[3] = new Thing("hotdog");
		thing1[4]=new Thing("table");
		thing1[5] = new Thing("stick");
		thing1[6]=new Thing("leaves");
		thing1[7]=new Thing("orange");
		thing1[8]=new Thing("pen");
		thing1[9]=new Thing("Flower");

		cr[0] = new Tiger("Ferocious");
		cr[1] = new Tiger("Dangerous");
		cr[2] = new Ant("Hard-working");
		cr[3] = new Bat("Supersonic");
		cr[4] = new Fly("Insectious");
		cr[5] = new Bat("Night");

		System.out.println("\n Things:\n");

		for(int i=0; i<THING_COUNT;i++){
			System.out.println(thing1[i]);
		}

		System.out.println("\n Creatures:\n");

		for(int i=0; i<CREATURE_COUNT;i++){
			System.out.println(cr[i]);
		}

		System.out.println();

		for(int i=0; i<CREATURE_COUNT;i++){

			cr[i].eat(thing1[i]);
			cr[i].move();
			cr[i].whatDidYouEat();
			System.out.println("");

		}

	}

}
