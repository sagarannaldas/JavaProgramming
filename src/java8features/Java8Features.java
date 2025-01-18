package java8features;

interface A {
    void show();

    default void show1() {
        System.out.println("Default method");
    }

    static void show2() {
        System.out.println("Static method");
    }
}

class B implements A {

    @Override
    public void show() {
        System.out.println("Method Defination");
    }
}

public class Java8Features {
    public static void main(String[] args) {
        A.show2();
        A b = new B();
        b.show();
        b.show1();
    }
}
