/*
 * Exercise 5.1 from the Liang Java Textbook 8E
 * Comprehensive Version
 */


package pkg5.pkg2;

/**
 *
 * @author Clint Sharp
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int inputInt = input.nextInt();
        System.out.println("The sum of " + inputInt + " is: " + sumDigits(inputInt));
        
    }
    
    public static int sumDigits(long n) {
        int temp = (int)Math.abs(n);
        int result = 0;
        do {
            int remainder = temp % 10;
            result += remainder;
            temp = temp / 10;
            
        } while (temp != 0);
        
        return result;
    }
    
}
