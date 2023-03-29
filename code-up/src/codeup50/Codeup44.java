package codeup50;

import java.util.Scanner;

public class Codeup44 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b > 0) {
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
			System.out.println(a % b);
			double num = (double)a;
			
			System.out.printf("%.2f",num / b);
		}
		
	}
}
