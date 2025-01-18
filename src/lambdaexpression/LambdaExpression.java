package lambdaexpression;

@FunctionalInterface
interface Car {
    // only single abstract method allowed
    void drive();
}

@FunctionalInterface
interface Car1 {
    // only single abstract method allowed
    void drive(int avg);
}

@FunctionalInterface
interface Car2 {
    // only single abstract method allowed
    void drive(int avg, int amount);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Car car = () -> System.out.println("Car Driving... "); // for single statement
        car.drive();

//        Car car2 = () -> {
//            System.out.println("Car2 Driving... ");
//        };
//        car2.drive();


        Car1 car1 = avg -> System.out.println("Car1 Driving... " + avg); // for single statement
        car1.drive(16);

//        Car1 car2 = (avg) -> {
//            System.out.println("Car2 Driving... " + avg);
//        };
//        car2.drive(10);

        Car2 car2 = (avg, amount) -> System.out.println("Car2 Driving... " + avg + " " + amount);
        car2.drive(15, 10000);

//        Car2 car2 = (avg, amount) -> {
//            System.out.println("Car2 Driving... " + avg + " " + amount);
//        };
//        car2.drive(15,10000);
    }
}
