package com.lernia.basiccalc;

import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private enum Raknesätt {plus, minus, division, multi}
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int first = 0;
		String str = "";
		int second = 0;
		
		System.out.println("Skriv din beräkning (x <räknesätt> y) : ");
		if(sc.hasNext()) {
			first = sc.nextInt();
			str = sc.next();
			second = sc.nextInt();
		}

		calc(first, setArithmetic(str), second);

		
	}
	
	private static void calc(int first, Raknesätt rs, int second) {
		System.out.println(rs.toString());

	}
	
	private static Raknesätt setArithmetic(String str) {
		
		Raknesätt rs;
		
		switch(str) {
		case "+":
			rs = Raknesätt.plus;
			return rs;
		case "-":
			rs = Raknesätt.minus;
			return rs;
		case "/":
			rs = Raknesätt.division;
			return rs;
		case "*":
			rs = Raknesätt.multi;
			return rs;
		}
		
		return null;
	}

		
}

