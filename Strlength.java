package coreJava;

import java.util.Scanner;

public class Strlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("enter a string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		int n = str.length();
		System.out.println("The length of the String is: " +n);

	}

}
