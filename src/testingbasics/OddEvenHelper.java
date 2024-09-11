package testingbasics;

import java.util.Scanner;

/**
 * Helper methods for determining whether integers are even or odd.
 */
public class OddEvenHelper {
    /**
     * Returns true if and only if the given number is even.
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns true if and only if the given number is odd.
     */
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("It is " + isEven(number) + " that " + number + " is even.");
        System.out.println("It is " + isOdd(number) + " that " + number + " is odd.");

        scanner.close();
    }
}
