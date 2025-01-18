package exception;

// Unchecked and Checked Exception

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UncheckedException {
    public static void main(String[] args) {

        // Unchecked Exception
        int result = 7 / 0;

        // Checked Exception
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
