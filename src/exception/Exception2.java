package exception;

public class Exception2 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 1;
        int result = 0;
        int[] value = {1, 2, 3, 4};

        try {
            result = num1 / num2;
            System.out.println(value[5]);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(value[value.length - 1]);
            System.out.println("going out of array size");
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }

        System.out.println(result);
        System.out.println("Finished execution");
    }
}
