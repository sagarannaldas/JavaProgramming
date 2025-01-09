package operators;

public class PostIncDec {
    public static void main(String[] args) {
        int a = 5;
        a = a + 1;
        a++;
        System.out.println("Increment: " + a);
        a--;
        System.out.println("Decrement: " + a);
    }
}
