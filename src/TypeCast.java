public class TypeCast {
    public static void main(String[] args) {
        int num1 = 55;
        double num2;
        num2 = num1;
        System.out.println(num2);

        double d = 45.5;
        int a;
        a = (int) d;

        System.out.println(a);


        int c = 12;
        int e = 5;
        float result1 = c/e;
        float result2 = (float) c/e;
        System.out.println(result1);
        System.out.println(result2);
    }
}
