package codeup30;

import java.util.Scanner;

public class Codeup21 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		String[] arr = a.split("\\.");
	
		System.out.printf("%s\n%s", arr[0], arr[1]);
		
	}	
}
