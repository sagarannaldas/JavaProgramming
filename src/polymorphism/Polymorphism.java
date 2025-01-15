package polymorphism;

class Aeroplane {
    void takeOff() {
        System.out.println("Aeroplane  is taking off");
    }

    void fly() {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane extends Aeroplane {
    void takeOff() {
        System.out.println("CargoPlane requires longer size runway");
    }

    void fly() {
        System.out.println("CargoPlane flies at low altitude");
    }
}

class PassengerPlane extends Aeroplane {
    void takeOff() {
        System.out.println("PassengerPlane requires medium size runway");
    }
    void fly() {
        System.out.println("PassengerPlane flies at medium altitude");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        CargoPlane cargoPlane = new CargoPlane();
//        cargoPlane1.takeOff();
//        cargoPlane1.fly();

        PassengerPlane passengerPlane = new PassengerPlane();
//        passengerPlane1.takeOff();
//        passengerPlane1.fly();
        Aeroplane ref;
        ref = cargoPlane;
        ref.takeOff();
        ref.fly();

        System.out.println("-------------------------------");

        ref = passengerPlane;
        ref.takeOff();
        ref.fly();
    }
}
