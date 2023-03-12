package de;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 This is java public class which is called Vektor (Träger, Fahrer). It has 4 public fields: 
 x, y are the coordinates of the first dot, 
 and a, b are the coordinates of the second dot.
 */
public class Vector {
	
	int x;
	int y;
	int a;
	int b;
	
	
	/*
	 This is a constructor with 0 parameters, it is used to call Superclass's constructor
	 */
	public Vector() {
	}
	/*
	 This is a constructor to initialise Vektor's parameters with 2 arguments
	 */
	public Vector(int x, int y, int a, int b) {
		super();
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
	}
/*
 * Vektor's modul is a length of a vektor. 
 * 
 * Here is a method which calculates it. It returns double value of length of a vektor.
 */
	double vektorsModul(int x, int y, int a, int b) {
		double VektorsModul = 0;
		
		int j = x - a;
		int k = y - b;
		VektorsModul = Math.sqrt((Math.pow(j, 2)) + Math.pow(k, 2));
		return VektorsModul;
	} 

/*
 * Main method to run the app, and to enter two coordinates
 */
	public static void main(String[] args) {
		
		int array [] = new int[4];
		
		
		try {
			for(int i = 0; i < array.length; i++) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please, write down positive number and click Enter:");
			array [i] = reader.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("Vektor's module = " + new Vector().vektorsModul(array [0], array [1], array [2], array [3]));
		Runtime.getRuntime().exit(0);
	}
	

}