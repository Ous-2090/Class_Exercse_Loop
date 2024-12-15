package LoopExercise;

import java.util.Scanner;

public class MeanAndStandardDeviation {
    /**
     * Main method to read floating-point inputs from the user, calculate the number of values,
     * their average, and standard deviation, and display the results. Input ends when the user
     * types "end". Non-numeric inputs other than "end" are considered invalid and prompt a warning.
     *
     * @param args Command-line arguments passed to the program (not utilized in this method).
     */
    public static void main(String[] args) {
        Scanner Question = new Scanner(System.in);

        DataSet dataSet = new DataSet();
        System.out.println("Enter a Floating-Point Values (Type 'end' to Finish) ");
        while (Question.hasNext()){
            if (Question.hasNextDouble()){
                double value = Question.nextDouble();
                dataSet.add(value);
            } else if (Question.next().equalsIgnoreCase("End")) {
                break;
            }else {
                System.out.println("Invalid input. Please enter a number or 'end' ");
            }
        }
        Question.close();
        int count = dataSet.getCount();
        if (count > 0){
            System.out.println("Number of Values: " + count);
            System.out.println("Average: " + dataSet.getAverage());
            System.out.println("Standard Deviation: " + dataSet.getStandardDeviation());
        }else {
            System.out.println("No Values were entered.");
        }
    }
}
class DataSet{
    private int count;
    private double sum;
    private double sumOfSquares;

    public DataSet(){
        count = 0;
        sum = 0;
        sumOfSquares = 0;
    }
    public void add(double value){
        count++;
        sum += value;
        sumOfSquares += value * value;
    }

    public int getCount() {
        return count;
    }
    public  double getAverage(){
        if (count == 0){
            return 0;
        }
        return  sum / count;
    }
    public double getStandardDeviation(){
        if (count < 2){
            return 0; // error if sd less than 2
        }
        double mean = getAverage();
        return Math.sqrt((sumOfSquares - (sum * sum)/ count) / (count - 1));
    }
}