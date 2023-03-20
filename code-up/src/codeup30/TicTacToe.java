package codeup30;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3]; // 틱택토 보드판
    private static char currentPlayer = 'X'; // 현재 플레이어

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        playGame();
    }

    // 보드판 초기화
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // 보드판 출력
    private static void printBoard() {
    	System.out.println("틱택토 게임에 오신것을 환영합니다.");
    	System.out.println("선 플레이어가 X, 후 플레이어가 O 입니다.");
    	System.out.println("칸은 3X3이며, 가로 0, 1, 2 세로 0, 1, 2 입니다.");
    	
    	
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // 게임 플레이
    private static void playGame() {
        boolean gameFinished = false;
        while (!gameFinished) {
            System.out.println("Player " + currentPlayer + ", 가로를 입력해 주세요 (0-2):");
            Scanner scanner = new Scanner(System.in);
            int row = scanner.nextInt();
            System.out.println("Player " + currentPlayer + ", 세로를 입력해 주세요 (0-2):");
            int col = scanner.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                continue;
            }

            if (board[row][col] != '-') {
                System.out.println("이미 수를 놓은 곳입니다. 다시 놔주세요");
                continue;
            }

            board[row][col] = currentPlayer;
            printBoard();

            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " 승!");
                gameFinished = true;
            } else if (checkTie()) {
                System.out.println("무승부입니다!");
                gameFinished = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    // 승리 여부 체크
    private static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            // 가로 체크
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            // 세로 체크
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        // 대각선 체크
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
		return false;
       
    }
    
    //무승부 여부 체크
    
    public static boolean checkTie() {
    	
    	for(int i = 0; i < board.length; i++) {
    		for(int j = 0; j < board.length; j++) {
    			if(board[0][0] != '-' && board[0][1] != '-' && board[0][2] != '-' 
    					&& board[1][0] != '-' && board[1][1] != '-' && board[1][2] != '-' 
    					&& board[2][0] != '-' && board[2][1] != '-' && board[2][2] != '-' ) {
    				return true;
    			}
    		}
    	}
    	
    	return false;
    }
    
}