package innerclass;

// inner - member, static and Anonymous

class A {
    public void show() {
        System.out.println("class A method show");
    }

    class B {
        public void disp() {
            System.out.println("Inner member class B disp method");
        }
    }

    static class C {
        public void disp() {
            System.out.println("Inner static class C disp method");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.C c = new A.C();
        a.show();
        b.disp();
        c.disp();

    }
}
