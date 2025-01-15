package abstraction;

abstract class Aeroplane {
    abstract void takeOff();

    abstract void fly();

    public void landing() {
        System.out.println("Aeroplane is landing");
    }
}

class CargoPlane extends Aeroplane {
    void takeOff() {
        System.out.println("CargoPlane requires longer size runway");
    }

    void fly() {
        System.out.println("CargoPlane flies at low altitude");
    }

    public void alert() {
        System.out.println("Alert...");
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

public class Abstraction {
    public static void main(String[] args) {
        Aeroplane ref = new CargoPlane();
        ref.takeOff();
        ref.fly();
        ref.landing();
        // specialized methods are not accessed directly with Parent reference
//        ref.alert();
        // DownCasting
        ((CargoPlane) ref).alert();
        Aeroplane ref1 = new PassengerPlane();
        ref1.takeOff();
        ref1.fly();
        ref1.landing();

    }
}
