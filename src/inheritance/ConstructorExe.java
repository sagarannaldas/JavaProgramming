package inheritance;

class Proto1 {
    int a, b;

    public Proto1() {
        System.out.println("Parent class default constructor");
    }

    public Proto1(int x, int y) {
        System.out.println("Parent class parameterized constructor");
        a = x;
        b = y;
    }
}

class Proto2 extends Proto1{
    int m, n;

    public Proto2() {
        this(10,20);
        System.out.println("Child class default constructor");
    }

    public Proto2(int x, int y) {
//        super();
        System.out.println("Child class parameterized constructor");
        m = x;
        n = y;
    }
}

public class ConstructorExe {
    public static void main(String[] args) {
        Proto2 proto2 = new Proto2();
//        Proto2 proto3 = new Proto2(10,20);
    }
}
