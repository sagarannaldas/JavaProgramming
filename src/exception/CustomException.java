package exception;

//Custom Exception and throw keyword

// custom exception
class MyException extends Exception {
    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = -3;

        try {
            if (num2 < 0) {
                Exception myException = new MyException("Negative Number");
                // throw keyword used to throw custom exception
                throw myException;
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("error... " + e);
        }
    }
}
