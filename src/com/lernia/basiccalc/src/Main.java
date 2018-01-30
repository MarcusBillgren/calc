package com.lernia.basiccalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private enum calculate {plus, minus, division, multi}
	
	public static void main(String[] args) {
		
		boolean bool = true;
		
		while (bool = true) {
			
			sc = new Scanner(System.in);
			int first = 0;
			String str = "";
			int second = 0;
			
			System.out.println("Type your calculation (x <arithmetic> y) : ");
			if(sc.hasNext()) {
				
				try {
					first = sc.nextInt();
				} 
				catch (InputMismatchException a) 
				{
					System.out.println("Please, insert only numbers.");
				}
				
				try {
					str = sc.next();
				} 
				catch (InputMismatchException a) 
				{
					System.out.println("Please, insert only arithmetic symbols: '*', '/', '+' or '-'.");
				}
				
				
				try {
					second = sc.nextInt();
				} 
				catch (InputMismatchException a) 
				{
					System.out.println("Please, insert only numbers.");
				}
				
			}

			calc(first, setArithmetic(str), second);
			
		}
		


		
	}
	
	private static void calc(int first, calculate rs, int second) {
		
		int answer = 0;
		
		if (rs.equals(calculate.plus)) {
			answer = first+second;
			System.out.println(answer);
			
		} else if (rs.equals(calculate.minus)) {
			answer = first-second;
			System.out.println(answer);
			
		} else if (rs.equals(calculate.division)) {
			answer = first/second;
			System.out.println(answer);
			
		} else if (rs.equals(calculate.multi)) {
			answer = first*second;
			System.out.println(answer);
			
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

