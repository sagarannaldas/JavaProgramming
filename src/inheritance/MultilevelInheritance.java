package inheritance;

class Demo1 {
    void disp1() {
        System.out.println("Disp written in demo1 class");
    }
}

class Demo2 extends Demo1{
//    void disp2() {
//        System.out.println("Disp written in demo2 class");
//    }
}

class Demo3 extends Demo2{
//    void disp3() {
//        System.out.println("Disp written in demo2 class");
//    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.disp1();
    }
}
