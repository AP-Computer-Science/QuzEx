package com.apcomputerscience.quizex;

import java.util.Scanner;
import org.fusesource.jansi.Ansi;

public class Quiz {
    private Question[] questions;
    private int count = 0;
    public Quiz(int numOfQuestions) {
        questions = new Question[numOfQuestions];
    }
    public void addQuestion(Question q) {
        if(count < questions.length) {
            questions[count] = q;
            count++;
        }
    }
    public void giveQuiz() {
        Scanner s = new Scanner(System.in);
        int amountOfQuestions = 0;
        Sorts.insertionSort(questions);
        for(Question q : questions) {
            System.out.println("Question " + (amountOfQuestions + 1));
            System.out.println("====================");
            System.out.println("Complexity: " + q.getComplexity());
            System.out.println(q.getQuestion());
            System.out.print("Enter answer (case insensitive). For true or false, use [T/F]: ");
            String input = s.nextLine().toUpperCase();
            System.out.println(Ansi.ansi().eraseScreen());
            if(!q.answerCorrect(input)) {
                System.out.println(Ansi.ansi().fg(Ansi.Color.RED).a("Incorrect: " + q.getWhy()).reset());
            }
            amountOfQuestions++;
        }
        int pointsEarned = 0;
        for(Question q : questions) {
            if(q.isCorrect()) pointsEarned++;
        }
        System.out.println("You got " + pointsEarned + "/" + questions.length + " (" + (int)(((double)pointsEarned / (double)questions.length) * 100.0) + "%)" + " right.");
    }
}
