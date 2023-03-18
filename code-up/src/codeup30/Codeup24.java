package codeup30;

import java.util.Scanner;

public class Codeup24 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		String[] arr = a.split("\\:");
		
		int h = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int s = Integer.parseInt(arr[2]);
		
		System.out.printf("%d", m);
		
	}	
}
