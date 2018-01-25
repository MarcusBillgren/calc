package com.lernia.basiccalc;

import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private enum Raknes�tt {plus, minus, division, multi}
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int first = 0;
		String str = "";
		int second = 0;
		
		System.out.println("Skriv din ber�kning (x <r�knes�tt> y) : ");
		if(sc.hasNext()) {
			first = sc.nextInt();
			str = sc.next();
			second = sc.nextInt();
		}

		calc(first, setArithmetic(str), second);

		
	}
	
	private static void calc(int first, Raknes�tt rs, int second) {
		System.out.println(rs.toString());

	}
	
	private static Raknes�tt setArithmetic(String str) {
		
		Raknes�tt rs;
		
		switch(str) {
		case "+":
			rs = Raknes�tt.plus;
			return rs;
		case "-":
			rs = Raknes�tt.minus;
			return rs;
		case "/":
			rs = Raknes�tt.division;
			return rs;
		case "*":
			rs = Raknes�tt.multi;
			return rs;
		}
		
		return null;
	}

		
}

