package loops;

public class Ternary {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 10;
        int res = (a < b)? a : b;
        System.out.println(res);
        String res1 = (a < b)? "a is less" : "b is less";
        System.out.println(res1);
        String res2 = (a < b)? (a < c)? "a is lesser": "c is lesser"  : (b < c)? "b is lesser" : "c is lesser" ;
        System.out.println(res2);


       if (a < b) {
            if (a < c) {
                System.out.println("a is lesser");
            } else {
                System.out.println("c is lesser");
            }
        } else {
            if (b < c) {
                System.out.println("b is lesser");
            } else {
                System.out.println("c is lesser");
            }
        }
    }
}
