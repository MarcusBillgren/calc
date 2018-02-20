//package com.lernia.basiccalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private enum calculate {plus, minus, division, multi}
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int first = 0;
		String str = "";
		int second = 0;			
		
		while (true) {			

				System.out.println("Type your calculation (x <arithmetic> y) , eg 3 + 3 or 111 * 3 : ");
									
					try {
						first = sc.nextInt();												
					}

					catch (InputMismatchException e) {
					    System.out.print("Error. Please insert according to 'x <arithmetic> y', eg 3 + 3 .");
					    sc.nextLine();
					}			
					
					try {
						str = sc.next();
					}

					catch (InputMismatchException e) {
					    System.out.print("Error. Please only insert '+', '-', '+' or '*'.");
					    //sc.nextLine();
					}
					
					
					try {
						second = sc.nextInt();						
					}

					catch (InputMismatchException e) {
					    System.out.print("Error. Please insert according to 'x <arithmetic> y', eg 3 + 3 .");
					    sc.nextLine();
					}
										
					if (str.equals("+") || str.equals("/") || str.equals("-") || str.equals("*")) {
						calc(first, setArithmetic(str), second);							
					} else {
						System.out.println("Error. Please only insert '+', '-', '+' or '*'.");							
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

