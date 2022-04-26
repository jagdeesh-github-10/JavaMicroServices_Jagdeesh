package coreJava;

import java.util.Scanner;

public class Strconcat {

	public static void main(String[] args) {
		
		String s1,s2,s3;
		System.out.println("enter 1st string: ");
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		
		System.out.println("enter 2nd string: ");
		s2 = sc.nextLine();
		sc.close();
		
		s3 = s1.concat(" " +s2);
		System.out.println("concatinated strings are: " + s3);

	}

}
