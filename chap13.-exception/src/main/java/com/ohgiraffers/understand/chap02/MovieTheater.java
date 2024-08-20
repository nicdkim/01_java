package main.java.com.ohgiraffers.understand.chap02;

import java.util.ArrayList;
import java.util.List;

public class MovieTheater {
    private List<Movie> movies;

    public MovieTheater() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println(movie.getTitle() + "이(가) 추가되었습니다.");
    }

    public void listMovies() {
        if (movies.isEmpty()) {
            System.out.println("현재 상영 중인 영화가 없습니다.");
        } else {
            System.out.println("|----- 현재 상영 중인 영화 목록 -----|");
            for (int i = 0; i < movies.size(); i++) {
                Movie movie = movies.get(i);
                System.out.println((i + 1) + ". " + movie.getTitle() + " (" + movie.getRunTime() + ")");
            }
            System.out.println("|--------------------------------|");
        }
    }

    public void reserveMovieSeat(int movieIndex, char row, int col) {
        if (movieIndex > 0 && movieIndex <= movies.size()) {
            Movie movie = movies.get(movieIndex - 1);
            movie.reserveSeat(row, col);
        } else {
            System.out.println("잘못된 영화 선택입니다.");
        }
    }

    public void showMovieDetails(int movieIndex) {
        if (movieIndex > 0 && movieIndex <= movies.size()) {
            Movie movie = movies.get(movieIndex - 1);
            movie.printSeatingChart();
        } else {
            System.out.println("잘못된 영화 선택입니다.");
        }
    }

    public boolean isEmpty() {
        return movies.isEmpty();
    }

    public boolean isValidMovieIndex(int index) {
        return index > 0 && index <= movies.size();
    }

    public Movie getMovie(int index) {
        return movies.get(index - 1);
    }
}
