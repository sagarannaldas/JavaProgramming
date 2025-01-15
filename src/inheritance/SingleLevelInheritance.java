package inheritance;

class Animal {
    public void sleep() {
        System.out.println("Animal needs to sleep");
    }
}

class Tiger extends Animal {


}

public class SingleLevelInheritance {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.sleep();
    }
}
