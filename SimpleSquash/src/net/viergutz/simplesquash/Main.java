package net.viergutz.simplesquash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		System.out.println("This is just a test!");
		
		int a = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			a = Integer.parseInt(in.readLine());
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		} catch (NumberFormatException nfe) {
			System.err.println("Incorrect number format!");
			System.exit(1);
		}
		
		a = square(a);
		System.out.println("The square of this number is "+a);
	}
	
	public static int square(int nr) {
		return nr*nr;
	}

}
