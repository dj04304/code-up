package codeup40;

import java.util.Scanner;

public class Codeup37 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int 로 하면 -1073741824 ~ 1073741824 범위가 안됨
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		System.out.println(a + b);
		
	}
}
