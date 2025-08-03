package com.java.tutorial;

import java.util.List;
import java.util.ArrayList;

public class ListClass {

	public void display() {
//	public static final int x = 20;
		// List - Interface
		// ArrayList - Class
		// Queue
		// Set
		// Map

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(6);
		a.add(5);
		System.out.println(a.size());
		System.out.println(a);
		System.out.println("What is at index 2");
		System.out.println(a.get(2));
		int x = a.remove(1);
		System.out.println(x);
		System.out.println(a);
		System.out.println(a.size());
		
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("Some string");
		b.add("Hello");
		b.add("World");
		System.out.println(b);
		
		
		ArrayList<Plumber> c = new ArrayList<Plumber>();
		Plumber p1 = new Plumber();
		Plumber p2 = new Plumber();
		Plumber p3 = new Plumber();
		c.add(p1);
		c.add(p2);
		c.add(p3);
		System.out.println(c);
		
		ArrayList<Plumber> d = new ArrayList<Plumber>();
		Plumber p4;
		for(int i=1;i<=3;i++) {
			p4 = new Plumber();
			d.add(p4);
		}
		System.out.println(d);
		
		ArrayList<Plumber> e = new ArrayList<Plumber>();

		for(int i=1;i<=3;i++) {
			Plumber p5 = new Plumber();
			e.add(p5);
		}
		System.out.println(e);
//		for(int i=0; i<=2;i++) {
//			System.out.println(e.get(i));
//		}
		for(Plumber p: e) {
			System.out.println(p);
		}
		
		
		
		
		
	}

}
