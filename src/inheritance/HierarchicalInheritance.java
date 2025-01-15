package inheritance;

class Animal1 {
    void sleep() {
        System.out.println("Animal needs sleep");
    }
}

class Tiger1 extends Animal1 {

}

class Monkey1 extends Animal1 {

}

class Deer1 extends Animal1 {

}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Tiger1 tiger1 = new Tiger1();
        tiger1.sleep();

        Monkey1 monkey1 = new Monkey1();
        monkey1.sleep();

        Deer1 deer1 = new Deer1();
        deer1.sleep();
    }
}
