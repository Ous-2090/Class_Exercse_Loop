package LoopExercise;
import java.util.Scanner;

/**
 * This class calculates the factorial of a given positive integer entered by the user.
 */
public class Question_Two_Factorial {
    public static void main(String[] args) {

        //a scanner object to prompt the user to enter an input

        Scanner Question = new Scanner(System.in);

        //this will prompt the user to enter an positive integer
        System.out.println("Please Enter a Positive Integer");
        int numb = Question.nextInt();

        //this will check if the value entered is positive number
        if (numb < 0){
            System.out.println("Please Enter a positive integer");
        }else{
            //this will initialize a factorial
            int factorial = 1;

            // a new variable to iterate the values from numb to 1
            int value = numb;

            //a while loop to check the factorial
            while(value > 0){
                //multiply the current value with the factorial
                factorial *= value;
                value--; //this will decrement the value

                //this will display the result

                System.out.println("The factorial of " + numb + " is: " + factorial);
            }

        }

    }
}
