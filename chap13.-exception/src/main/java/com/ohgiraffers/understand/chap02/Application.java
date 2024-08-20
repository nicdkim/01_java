package main.java.com.ohgiraffers.understand.chap02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTheater theater = new MovieTheater();

        while (true) {
            System.out.println("|------------------------------- 메뉴를 선택하세요 --------------------------------|");
            System.out.println("| 1. 영화 목록 조회 | 2. 영화 좌석 예매 | 3. 영화 상세 정보 조회 | 4. 영화 추가 | 0. 종료 |");
            System.out.println("|-------------------------------------------------------------------------------|");
            System.out.print("선택 : ");
            int choice;

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1:
                    theater.listMovies();
                    break;
                case 2:
                    if (theater.isEmpty()) {
                        System.out.println("현재 상영 중인 영화가 없습니다. 예매할 수 없습니다.");
                        break;
                    }
                    theater.listMovies();
                    System.out.print("예매할 영화 번호를 선택하세요: ");
                    int movieIndex = sc.nextInt();

                    if (!theater.isValidMovieIndex(movieIndex)) {
                        System.out.println("잘못된 영화 선택입니다.");
                        break;
                    }

                    System.out.print("예매할 좌석 행을 입력하세요 : ");
                    char row = sc.next().toUpperCase().charAt(0);
                    while (row < 'A' || row >= 'A' + theater.getMovie(movieIndex).getRows()) {
                        System.out.print("잘못된 좌석입니다. 다시 입력하세요 : ");
                        row = sc.next().toUpperCase().charAt(0);
                    }

                    System.out.print("예매할 좌석 열을 입력하세요 : ");
                    int col;
                    while (true) {
                        try {
                            col = sc.nextInt();
                            if (col < 1 || col > theater.getMovie(movieIndex).getCols()) {
                                System.out.print("잘못된 좌석입니다. 다시 입력하세요(1부터 " +
                                        theater.getMovie(movieIndex).getCols() + "까지의 숫자만 입력 가능합니다): ");
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.print("잘못된 입력입니다. 숫자를 입력하세요: ");
                            sc.next();
                        }
                    }

                    theater.reserveMovieSeat(movieIndex, row, col);
                    break;
                case 3:
                    if (theater.isEmpty()) {
                        System.out.println("현재 상영 중인 영화가 없습니다.");
                        break;
                    }
                    theater.listMovies();
                    System.out.print("조회할 영화 번호를 선택하세요: ");
                    movieIndex = sc.nextInt();

                    if (!theater.isValidMovieIndex(movieIndex)) {
                        System.out.println("잘못된 영화 선택입니다.");
                        break;
                    }

                    theater.showMovieDetails(movieIndex);
                    break;
                case 4:
                    System.out.print("영화 제목을 입력하세요: ");
                    sc.nextLine();
                    String title = sc.nextLine();

                    System.out.print("상영 시간을 입력하세요 : ");
                    String runTime = sc.nextLine();

                    System.out.print("좌석 행 수를 입력하세요: ");
                    int rows = sc.nextInt();

                    System.out.print("좌석 열 수를 입력하세요: ");
                    int cols = sc.nextInt();

                    Movie movie = new Movie(title, runTime, rows, cols);
                    theater.addMovie(movie);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }
}