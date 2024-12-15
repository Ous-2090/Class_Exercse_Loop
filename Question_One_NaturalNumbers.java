package LoopExercise;
import java.util.Scanner;

/**
 * The Question_One_NaturalNumbers class calculates the sum of all natural numbers
 * up to a user-specified positive integer. The program prompts the user to input
 * a positive integer, validates the input, and computes the sum of all natural
 * numbers from 1 up to the entered number.
 *
 * Features:
 * - Accepts a positive integer input from the user.
 * - Validates the entered value to ensure it is positive.
 * - Displays an error message if the input is not a positive integer.
 * - Computes the sum of natural numbers from 1 to the provided input.
 * - Outputs the result to the console.
 */
public class Question_One_NaturalNumbers {
    public static void main(String[] args) {
        Scanner Question = new Scanner(System.in);

        //This will prompt the user to enter a number(Positive)
        System.out.println("Please Enter a positive integer:");
        int numb = Question.nextInt();

        //a loop to check if the number entered is positive
        if (numb <= 0){
            System.out.println("Please enter a positive number");
        }else {

            //this variable will create a database and stored for sum values
            int sum = 0;
            //a for loop to calculate the sum of values between 1 and n value
            for (int i = 1; i <= numb; i++){
                //this will add the current value to sum values
                sum += i;
            }
            //a print statement to display the result
            System.out.println("The sum of all Natural Numbers up to " + numb + " is: " + sum);
        }
    }
}
