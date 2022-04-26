package coreJava;

import java.util.Scanner;

public class string6 {

	public static void main(String[] args) {
		String str;
		System.out.println("enter a string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
//		System.out.println("the lowercase strings is: " + str.toLowerCase());
		
//		System.out.println("the lowercase strings is: " + str.toUpperCase());
		
//		System.out.println("replacing character: " + str.replace('a','$'));
		
//		System.out.println("contains return a boolean value: " + str.contains("hello"));
		
		System.out.println(str.matches("(.*)hello(.*)"));
		
//		System.out.println(s1.equals(s2));
	}

}
