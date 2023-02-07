package org.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] questions = {
                {"What is the capital of Russia?", "Moscow", "Saint Petersburg", "Kazan", "Sochi", "1"},
                {"What is the currency of Japan?", "Yen", "Dollar", "Euro", "Pound", "1"},
                {"What is the highest mountain in the world?", "K2", "Mount Everest", "Kangchenjunga", "Lhotse", "2"}
        };

        int correctAnswers = 0;

        for (String[] question : questions) {
            System.out.println(question[0]);

            for (int i = 1; i < question.length - 1; i++) {
                System.out.println(i + ") " + question[i]);
            }

            System.out.print("Enter your answer: ");
            int answer = in.nextInt();

            if (answer == Integer.parseInt(question[question.length - 1])) {
                correctAnswers++;
            }
        }

        System.out.println("You got " + correctAnswers + " out of " + questions.length + " questions correct.");
    }
}
