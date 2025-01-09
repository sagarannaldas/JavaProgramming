package operators;

public class PreIncDec {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println(a);
        System.out.println("Post Increment: " + b);
        int c = ++a;
        System.out.println("Pre Increment: " + c);
        int d = ++a + a++ + --a;
        System.out.println("Operation: " + d); // 8 + 8 + 8 = 24
        System.out.println(a); //8
        int e = a++ + ++a + ++a + a++ + --a + a--; // 8 + 10 + 11 + 11 + 11 + 11 = 62
        System.out.println("Operation: " + e);
        System.out.println(a); //10
    }
}
