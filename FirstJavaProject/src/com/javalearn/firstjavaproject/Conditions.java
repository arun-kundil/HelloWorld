/**
 * 
 */
package com.javalearn.firstjavaproject;

import java.util.Scanner;

/**
 * @author arunk
 *
 */
public class Conditions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inputNumber = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int number1 = inputNumber.nextInt();
		int number2 = inputNumber.nextInt();
		int number3 = inputNumber.nextInt();
		int largest;

		if (number1 >= number2) {
			if (number1 >= number3) {
				largest = number1;
			}

			else {
				largest = number3;
			}
		}

		else {
			if (number2 >= number3) {
				largest = number2;
			}

			else {
				largest = number3;
			}
		}

		System.out.println(largest + " is the largest number");

		inputNumber.close();

	}

}
