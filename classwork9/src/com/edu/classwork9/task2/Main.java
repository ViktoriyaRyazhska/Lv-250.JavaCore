package com.edu.classwork9.task2;

public class Main {

	public static void main(String[] args) {
		Plants[] pl = new Plants[5];
		try {
		      pl[0] = new Plants("tree", "green", 10);
		      System.out.println(pl[0]);
		      pl[1] = new Plants("flower", "red", 1);
		      System.out.println(pl[1]);
		      pl[2] = new Plants("bush", "green", 3);
		      System.out.println(pl[2]);
		      pl[3] = new Plants("flower", "blue", 5);
		      System.out.println(pl[3]);
		      pl[4] = new Plants("grace", "green", 1);
		      System.out.println(pl[4]);
		   } catch (ColorException | TypeException e) {
		      System.err.println(e.getMessage());
		   }
	}

}
