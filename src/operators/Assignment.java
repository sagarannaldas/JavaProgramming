package operators;

public class Assignment {
    public static void main(String[] args) {
        int m1, m2, m3, m4, m5;

        m1 = m2 = m3 = m4 = m5 = 10;

        System.out.println(m1);
        System.out.println(m1 + m2 + m3 + m4 + m5);
        System.out.println(m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5);

        int a = 10;
        a += 5;
        System.out.println(a);

        int b = 10;
        b -= 5;
        System.out.println(b);

        int c = 10;
        c /= 5;
        System.out.println(c);

        int d = 10;
        d *= 5;
        System.out.println(d);

        int e = 10;
        e %= 5;
        System.out.println(e);
    }
}
