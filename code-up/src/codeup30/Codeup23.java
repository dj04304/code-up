package codeup30;

import java.util.Scanner;

public class Codeup23 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		char[] arr = a.toCharArray();
		
		int count = arr.length;
		
		for(int i = 0; i < arr.length; i++) {
			count--;
			System.out.print("[" + arr[i]);
			
			for(int j = 0; j < count; j++) {
				System.out.print("0");
			}
			System.out.print("]\n");
		}
		
	}	
}
