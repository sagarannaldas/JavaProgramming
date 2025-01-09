package loops;

public class Loops1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("for loop");
        }

        System.out.println("----------------------");

        int i = 0;
        while (i < 5) {
            System.out.println("while loop");
            i++;
        }

        System.out.println("------------------------");

        int j = 0;
        do {
            System.out.println("do while loop");
            j++;
        } while (j < 5);
    }
}
