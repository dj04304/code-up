package codeup30;

import java.util.Scanner;

public class Codeup25 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		String[] arr = a.split("\\.");
		
		int y = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int d= Integer.parseInt(arr[2]);
		
		System.out.printf("%02d-%02d-%04d", d, m, y);
		
		
	}	
}
