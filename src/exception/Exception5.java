package exception;

import java.util.Scanner;

public class Exception5 {
    public static void main(String[] args) {
        int num = 0;

        // try with resource
        try (Scanner scanner = new Scanner(System.in)) {
            num = scanner.nextInt();

        }
        // It executes always whether having exception or not.

        System.out.println(num);
    }
}
