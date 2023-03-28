package codeup40;

import java.util.Scanner;

public class Codeup40 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		int asc = (int)ch;
		
		System.out.println((char)(asc + 1));
		
	}
}
