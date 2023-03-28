package codeup40;

import java.util.Scanner;

public class Codeup32 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hex = sc.nextInt();
		
		String hexString = Integer.toHexString(hex);
		
		System.out.println(hexString.toUpperCase());
		
	}
}
