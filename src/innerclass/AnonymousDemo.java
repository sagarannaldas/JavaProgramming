package innerclass;

interface Car {
    void drive();
}

public class AnonymousDemo {
    public static void main(String[] args) {
        // Anonymous inner class
        Car obj = new Car() {
            @Override
            public void drive() {
                System.out.println("Driving...");
            }
        };
        obj.drive();
    }
}
