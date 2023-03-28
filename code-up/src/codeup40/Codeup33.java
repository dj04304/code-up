package codeup40;

import java.util.Scanner;

public class Codeup33 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String octal = sc.nextLine();
		
		int num = Integer.parseInt(octal, 8);
		
		System.out.println(num);
		
	}
}
