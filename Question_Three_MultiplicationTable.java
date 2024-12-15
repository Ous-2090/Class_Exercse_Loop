package LoopExercise;
import java.util.Scanner;

/**
 * The Question_Three_MultiplicationTable class generates and displays
 * the multiplication table for a user-provided integer.
 *
 * This program prompts the user to input an integer and displays its
 * multiplication table from 1 to 10.
 *
 * Functionalities:
 * - Accepts user input using the Scanner class.
 * - Uses a do-while loop to iterate from 1 to 10.
 * - Prints the result of the multiplication in each iteration.
 *
 * Key Components:
 * - Scanner class for user input.
 * - do-while loop for generating the multiplication table.
 * - Iterative multiplication process to calculate and display results.
 */
public class Question_Three_MultiplicationTable {
    public static void main(String[] args) {

        //a scanner class to handle user inputs
        Scanner Question = new Scanner(System.in);

        //this will prompt the user to enter a variable
        System.out.println("Enter an interger");
        int number = Question.nextInt();

        //this will initialized a loop that will count
        int count = 1;

        //a do-while loop
        do {
            System.out.println(number + " X " + count + " = " + (number * count));
            count++; //this will increment the count
        }while (count <= 10); //this will loop until the count reaches to 10

    }
}
