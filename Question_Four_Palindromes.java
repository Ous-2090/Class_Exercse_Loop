package LoopExercise;

import java.util.Scanner;

/**
 * This class, Question_Four_Palindromes, checks whether a given integer
 * input by the user is a palindrome or not. A palindrome is a number
 * that reads the same backward as forward.
 *
 * The program prompts the user to enter an integer, reverses the digits
 * of the entered number, and compares the reversed number to the original
 * to determine if it is a palindrome.
 */
public class Question_Four_Palindromes {
    public static void main(String[] args) {
        Scanner Question = new Scanner(System.in);

        //this will prompt the user to enter a number
        System.out.println("Enter an integer");
        int numb = Question.nextInt();

        //this will store the entered number
        int numberEntered =  numb;
        //this will initialized a reverse
        int numberReserved = 0;

        //a while loop to reverse
        while (numb != 0){
            int digit = numb % 10; //remove the lase digit
            numberReserved = numberReserved * 10 + digit;
            numb /= 10;
        }
        //this will compare the original and reversed number
        if (numberEntered == numberReserved){
            System.out.println(numberEntered + " is a Palindrome. ");
        }else{
            System.out.println(numberEntered + " is not a Palindrome. ");
        }
    }
}
