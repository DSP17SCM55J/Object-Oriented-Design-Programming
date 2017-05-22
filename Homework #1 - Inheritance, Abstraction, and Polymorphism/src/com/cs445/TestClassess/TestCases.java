package com.cs445.TestClassess;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cs445.classes.Ant;
import com.cs445.classes.Bat;
import com.cs445.classes.Creature;
import com.cs445.classes.Fly;
import com.cs445.classes.Thing;
import com.cs445.classes.Tiger;

import junit.framework.TestCase;

public class TestCases extends TestCase {

	Creature cr0 = new Ant("Ant1");
	Creature cr1 = new Bat("Bat");
	Creature cr2 = new Tiger("Tiger");
	Creature cr3 = new Fly("Fly");

	Thing thing1 = new Thing("table");

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	//private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	 PrintStream ps = new PrintStream(outContent);
	 PrintStream old = System.out;
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		//  System.setErr(new PrintStream(errContent));
	}

	@Test
	public void testToString(){
		
		assertEquals("Ant", cr0.getClass().getSimpleName());
		assertEquals("Bat", cr1.getClass().getSimpleName());
		assertEquals("Tiger", cr2.getClass().getSimpleName());
		assertEquals("Fly", cr3.getClass().getSimpleName());
	}

	@Test
	public void testMove1(){
		
		cr0.move();
		String s = outContent.toString();
		String d = s.trim();
		//System.out.println(d);
		//assertEquals("Ant1 Ant is crawling around.", d);
		System.setOut(ps);
	    cr2.move();
	    System.out.flush();
	    System.setOut(old);
	    
	    String actualOutput = outContent.toString().trim();
		String expectedOutput = "Tiger Tiger has just pounced";
assertEquals(expectedOutput, actualOutput);
	}

	/**
	 * @param athing
	 * @see com.cs445.classes.Creature#eat(com.cs445.classes.Thing)
	 */
	public void eat(Thing athing) {
		cr0.eat(athing);
	}

	/**
	 * 
	 * @see com.cs445.classes.Creature#whatDidYouEat()
	 */
	public void whatDidYouEat() {
		cr0.whatDidYouEat();
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}
}
