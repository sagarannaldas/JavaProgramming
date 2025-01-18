package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            num = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
        } finally {
            // It executes always whether having exception or not.
            scanner.close();
        }

        System.out.println(num);
    }
}
