package com.vyadrov.runners.homework.lesson16;

import com.vyadrov.app.utils.homework.lesson16.MovieStars;

import java.util.Random;
import java.util.Scanner;

public class Lesson16Runner {
    public static boolean[] movieStarIdIsRepeated;
    public static int i = 0;
    public static void main(String[] args) {
        int inputAge;
        int guessedAttemps = 0;
        int randomNumberMovieStar;
        String randomStar = "";
        MovieStars[] starsArray = MovieStars.values();
        int a = starsArray.length;
        movieStarIdIsRepeated = new boolean[a];
        for (int i = 0; i < movieStarIdIsRepeated.length; i++) {
            movieStarIdIsRepeated[i] = false;
        }
        Random random = new Random();
        try(Scanner scanner = new Scanner(System.in)) {
            do {
                randomNumberMovieStar = random.nextInt(starsArray.length);
                if (movieStarIdIsRepeated[randomNumberMovieStar] == true) {
                    random.nextInt(starsArray.length);
                } else {
                    movieStarIdIsRepeated[randomNumberMovieStar] = true;
                    randomStar = starsArray[randomNumberMovieStar].getActor();
                    System.out.println("Please enter how old is " + randomStar + " do you think?");
                    inputAge = scanner.nextInt();
                    if (inputAge == starsArray[randomNumberMovieStar].getYearsOld()) {
                        System.out.println("Congrats! you are right.");
                        guessedAttemps++;
                    } else {
                        System.out.println("Sorry, but you are wrong! His age is " + starsArray[randomNumberMovieStar].getYearsOld() + ". Try again with another actor:");
                        movieStarIdIsRepeated[randomNumberMovieStar] = true;
                    }
                }
            } while (guessedAttemps !=3);
        }
        System.out.println("Well done. You won!");
    }
}
