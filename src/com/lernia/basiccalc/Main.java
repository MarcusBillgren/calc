package com.lernia.basiccalc;

import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private enum calculate {plus, minus, division, multi}
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int first;
		String str;
		int second;
		
		while (true) {
			try {

				System.out.println("Type your calculation (x <arithmetic> y) : ");
				if (sc.hasNext()) {
					first = sc.nextInt();
					str = sc.next();
					second = sc.nextInt();

					calc(first, setArithmetic(str), second);
				} else {
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
	}
	
	private static void calc(int first, calculate rs, int second) {
		
		int answer = 0;
		String info = "The answer is: ";
		
		if (rs.equals(calculate.plus)) {
			answer = first+second;
			System.out.println(info + answer);
			
		} else if (rs.equals(calculate.minus)) {
			answer = first-second;
			System.out.println(info + answer);
			
		} else if (rs.equals(calculate.division)) {
			answer = first/second;
			System.out.println(info + answer);
			
		} else if (rs.equals(calculate.multi)) {
			answer = first*second;
			System.out.println(info + answer);
			
		} else {
			System.out.println("Error.");
		}

	}
	
	private static calculate setArithmetic(String str) {
		
		calculate rs;
		
		switch(str) {
		case "+":
			rs = calculate.plus;
			return rs;
		case "-":
			rs = calculate.minus;
			return rs;
		case "/":
			rs = calculate.division;
			return rs;
		case "*":
			rs = calculate.multi;
			return rs;
		}
		
		return null;
	}

		
}

