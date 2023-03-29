package codeup50;

import java.util.Scanner;

public class Codeup45 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = a + b + c;
		
		System.out.println(result);
		System.out.printf("%.1f", (double)result / 3);
		
		}
	
}
