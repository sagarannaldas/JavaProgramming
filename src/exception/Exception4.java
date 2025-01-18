package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            num = scanner.nextInt();

        } finally {
            // It executes always whether having exception or not.
            scanner.close();
        }

        System.out.println(num);
    }
}
