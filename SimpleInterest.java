package coreJava;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float principal,roi,time,si;
		System.out.println("enter the principal amount:");
		Scanner sc = new Scanner(System.in);
		principal = sc.nextInt();
//		System.out.println("the principal amount is:" +principal);
		
		System.out.println("enter the roi");
		roi = sc.nextInt();
		
//		System.out.println("the rate of interest is: " + roi);
		
		System.out.println("enter the tenure:");
		
		time = sc.nextInt();
		
//		System.out.println("the tenure is:" + time);
		
		si = (principal * roi * time) / 100;
		
		System.out.println("the simple interest is: " + si);
		

	}

}
