package codeup30;

import java.util.Scanner;

public class Codeup30 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int octal = sc.nextInt();
		
		String ocatalString = Integer.toOctalString(octal);
		
		System.out.println(ocatalString);
		
	}	
}
