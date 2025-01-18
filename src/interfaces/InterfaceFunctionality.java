package interfaces;

interface A {
//    int num = 6; // by default public static final
    void show(); // by default public and abstract
}

interface A1 {
    void abc();
}

class B implements A, A1{

    @Override
    public void show() {
        System.out.println("In Show");
    }

    @Override
    public void abc() {
        System.out.println("In abc");
    }
}

public class InterfaceFunctionality {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.abc();
    }
}
