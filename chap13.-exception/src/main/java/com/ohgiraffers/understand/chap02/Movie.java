package main.java.com.ohgiraffers.understand.chap02;

public class Movie {
    private String title;
    private String runTime;
    private char[][] seats;
    private int totalSeats;
    private int reservedSeats;
    private int rows;
    private int cols;

    public Movie(String title, String runTime, int rows, int cols) {
        this.title = title;
        this.runTime = runTime;
        this.totalSeats = rows * cols;
        this.reservedSeats = 0;
        this.rows = rows;
        this.cols = cols;
        this.seats = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = ' ';
            }
        }
    }

    public Movie() {
        Movie movie = new Movie();
        movie.printSeatingChart();
    }

    public boolean reserveSeat(char row, int col) {
        int rowIndex = row - 'A';
        int colIndex = col - 1;

        if (rowIndex >= 0 && rowIndex < seats.length && colIndex >= 0 && colIndex < seats[0].length) {
            if (seats[rowIndex][colIndex] == ' ') {
                seats[rowIndex][colIndex] = 'X';
                reservedSeats++;
                System.out.println("좌석 " + row + col + "이 예약되었습니다.");
                return true;
            } else {
                System.out.println("이미 예약된 좌석입니다.");
                return false;
            }
        } else {
            System.out.println("잘못된 좌석 번호입니다.");
            return false;
        }
    }

    public int getAvailableSeats() {
        return totalSeats - reservedSeats;
    }

    public void printSeatingChart() {
        System.out.println("\n\t\t\t\t\t\t\t  [ Screen ]\n");

        for (int i = 0; i < seats.length; i++) {
            System.out.print("\t\t\t" + (char) ('A' + i) + " ");

            for (int j = 0; j < 2; j++) {
                System.out.print("[" + seats[i][j] + "]");
            }

            System.out.print("\t");

            for (int j = 2; j < seats[i].length - 2; j++) {
                System.out.print("[" + seats[i][j] + "]");
            }

            System.out.print("\t");

            for (int j = seats[i].length - 2; j < seats[i].length; j++) {
                System.out.print("[" + seats[i][j] + "]");
            }

            System.out.println();
        }

        System.out.println("\n총 좌석 수: " + totalSeats + "석, 남은 좌석 수: " + getAvailableSeats() + "석");
    }

    public String getTitle() {
        return title;
    }

    public String getRunTime() {
        return runTime;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

}