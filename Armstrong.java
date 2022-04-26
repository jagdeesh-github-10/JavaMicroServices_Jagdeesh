package coreJava;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int number,rem,arm = 0,temp;
		System.out.println("enter a 3 digit number:");
		Scanner r = new Scanner(System.in);
		number = r.nextInt();
		temp = number;
		while(number > 0) {
			rem = number % 10;
			arm = (rem*rem*rem) + arm;
			number = number / 10;
		}
		if(temp == arm) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not an armstrong");
		}

	}
}	