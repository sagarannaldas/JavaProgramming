package finalkeyword;

//final class Animal {
//    void sleep() {
//        System.out.println("Animal is sleeping");
//    }
//}
class Animal {
    final int age = 19;
    final void sleep() {
//        Cannot assign a value to final variable 'age'
//        age = 20;
        System.out.println("Animal is sleeping");
    }
}

class Tiger extends Animal {

//'sleep()' cannot override 'sleep()' in 'finalkeyword. Animal'; overridden method is final
//    void sleep() {
//
//    }

}

public class FinalClass {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.sleep();
    }
}
