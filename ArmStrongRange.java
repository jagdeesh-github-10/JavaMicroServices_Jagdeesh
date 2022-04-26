package coreJava;

import java.util.Scanner;

public class ArmStrongRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting range:");
		int a = sc.nextInt();
		System.out.println("enter the ending range:");
		int b = sc.nextInt();
		
		findArmstrong(a , b);
	}
	
	static void findArmstrong(int a, int b) {
		for(int i=a; i<=b; i++) {
			int num = i,sum = 0;
			while(num > 0) {
				int remainder = num % 10;
				sum = sum + (remainder * remainder * remainder);
				num/=10;
			}
			if(sum == i) {
				System.out.println(sum);
			}
			
		}
	}

}
