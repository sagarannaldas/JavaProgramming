package generics;

class A<T> {
    T obj;
    public A(T obj) {
        this.obj = obj;
    }
    void disp() {
        System.out.println("The type of data is: " + obj.getClass().getName());
    }
    public T getObject() {
        return obj;
    }
}

public class Generics2 {
    public static void main(String[] args) {
        A<Integer> a1 = new A<Integer>(10);
        a1.disp();
        System.out.println(a1.getObject());

        A<String> a2 = new A<String>("PW");
        a2.disp();
        System.out.println(a2.getObject());
    }
}
