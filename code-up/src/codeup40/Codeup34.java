package codeup40;

import java.util.Scanner;

public class Codeup34 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String octal = sc.nextLine();
		
		int num = Integer.parseInt(octal, 16);
		
		String hexToOct = Integer.toOctalString(num); 
		
		System.out.println(hexToOct);
		
	}
}
