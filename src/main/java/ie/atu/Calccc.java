package ie.atu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calccc {
    public static void main(String[] args) {
        mul();

    }
    public static void mul()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is: " + total);
    }
}
