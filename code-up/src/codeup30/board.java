package codeup30;

public class board {

	public static void main(String[] args) {
	
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = "-";
			}
		}
		
		System.out.println("---------------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.print("l ");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " l ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
	}	
}
