package codeup20;

import java.util.Scanner;

public class Codeup17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] a = sc.nextLine().split("\\.");
		
		int y = Integer.parseInt(a[0]);
		int m = Integer.parseInt(a[1]);
		int d = Integer.parseInt(a[2]);
		
		System.out.printf("%04d.%02d.%02d", y, m, d);
		
 	}
}


