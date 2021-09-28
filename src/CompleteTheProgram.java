/*
Create a program to receive a number from the user.
Using the for loop, countdown (on the same line) from that number to 1
 */
import java.util.Scanner;

public class CompleteTheProgram {
    public static void main (String [] args) {
        //set up the variables
        Scanner keybd = new Scanner(System.in);
        int userInput;

        System.out.println("Enter a number: ");
        userInput = keybd.nextInt();

        for (int i = userInput; i > 0; i--)
        {
            System.out.print(i + " "); // Use print with no carriage return
        }
        System.out.println(); // Not necessary but printing a carriage return.
    }
}
