package staticfunctionality;

class Demo {
    static int a;
    static int b;

    int c;
    int d;

    static {
        System.out.println("Control in static block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("Control in non static block");
        c = 30;
        d = 40;
    }

    static void disp1() {
        System.out.println("Value of static variable a: " + a);
        System.out.println("Value of static variable b: " + b);
    }

    void disp2() {
        System.out.println("Value of non static variable c: " + c);
        System.out.println("Value of non static variable d: " + d);
    }
}

public class StaticFunctionality {
    public static void main(String[] args) {
        Demo.disp1();
        Demo demo = new Demo();
        demo.disp2();
    }
}
