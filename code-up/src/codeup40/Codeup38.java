package codeup40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup38 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num[];
		
		num = br.readLine().split(" ");
		
		long result = Long.parseLong(num[0]) + Long.parseLong(num[1]);
		
		System.out.println(result);
		
	}
}
