package main.java.com.ohgiraffers.section02.demensional;

import java.util.Scanner;

public class Go {
    static int size = 19;
    static char[][] board = new char[size][size];
    static char currentPlayer = '1';
    static int player1Wins = 0;
    static int player2Wins = 0;
    static int player1Losses = 0;
    static int player2Losses = 0;

    static {
        size = getBoardSize();
        board = new char[size][size];
    }

    public static int getBoardSize() {
        Scanner sc = new Scanner(System.in);
        System.out.print("바둑판의 크기 : ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        boolean playAgain = true;

        while (playAgain) {
            Board();
            boolean gameWon = false;
            while (!gameWon) {
                printBoard();
                Move();
                gameWon = checkWin();
                if (gameWon) {
                    printBoard();
                    System.out.println("Player" + currentPlayer + " 승");
                    updateScore();
                    printScore();
                } else {
                    switchPlayer();
                }
            }
            playAgain = askPlayAgain();
        }
    }

    public static void Board() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '.';
            }
        }
    }

    public static void printBoard() {
        System.out.print("   ");
        for (int i = 0; i < size; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.printf("%2d ", i);
            for (int j = 0; j < size; j++) {
                System.out.printf("%2c ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void Move() {
        Scanner sc = new Scanner(System.in);
        int row, col;
        while (true) {
            System.out.print("Player " + currentPlayer + " 행 : ");
            row = sc.nextInt();
            System.out.print("Player " + currentPlayer + " 열 : ");
            col = sc.nextInt();
            if (row >= 0 && row < size && col >= 0 && col < size &&
                    board[row][col] == '.') {
                board[row][col] = currentPlayer == '1' ? '○' : '●';
                break;
            }
            System.out.println("그 쪽에는 둘 수 없습니다.");
        }
    }

    public static void switchPlayer() {
        currentPlayer = (currentPlayer == '1') ? '2' : '1';
    }

    public static boolean checkWin() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j] != '.' && (
                        checkDirection(i,j,1,0) ||
                        checkDirection(i,j,0,1) ||
                        checkDirection(i,j,1,1) ||
                        checkDirection(i,j,1,-1)))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkDirection(int row, int col, int dRow, int dCol) {
        char symbol = board[row][col];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            int newRow = row + i * dRow;
            int newCol = col + i * dCol;

            if (newRow >= 0 && newRow < size && newCol >= 0 && newCol < size &&
                    board[newRow][newCol] == symbol) {
                count++;
            } else {
                break;
            }
        }

        if (count != 5) {
            return false;
        }

        int bRow = row - dRow;
        int bCol = col - dCol;

        int aRow = row + 5 * dRow;
        int aCol = col + 5 * dCol;

        boolean beforeEmpty = (
                bRow < 0        ||
                bRow >= size    ||
                bCol < 0        ||
                bCol >= size    ||
                board[bRow][bCol] == '.');
        boolean afterEmpty = (
                aRow < 0        ||
                aRow >= size    ||
                aCol < 0        ||
                aCol >= size    ||
                board[aRow][aCol] == '.');

        return beforeEmpty && afterEmpty;
    }

    public static void updateScore() {
        if (currentPlayer == '1') {
            player1Wins++;
            player2Losses++;
        } else {
            player2Wins++;
            player1Losses++;
        }
    }

    public static void printScore() {
        System.out.println("|----------------------------|");
        System.out.println("|          현재 스코어         |");
        System.out.println("| Player 1 (○) - 승: " + player1Wins + ", 패: " + player1Losses + " |");
        System.out.println("| Player 2 (●) - 승: " + player2Wins + ", 패: " + player2Losses + " |");
        System.out.println("|----------------------------|");
    }

    public static boolean askPlayAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.print("다시 플레이 하시겠습니까? (y/n): ");
        String answer = sc.next();
        return answer.equalsIgnoreCase("y");
    }
}