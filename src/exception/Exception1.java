package exception;

public class Exception1 {
    public static void main(String[] args) {
        int num1 = 9; // normal statement
        int num2 = 0;
        int result = 0;

        try {
            result = num1 / num2; // critical statement - where exception can occur
            System.out.println("In try block");
        } catch (Exception e) {
            System.out.println("Something went wrong.." + e);
        }

        System.out.println(result);
        System.out.println("Finished");
    }
}
