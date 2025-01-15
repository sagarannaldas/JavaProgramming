package inheritance;

class Aeroplane {
    // Inherited method
    void takeOff() {
        System.out.println("Aeroplane class take off");
    }

    // overridden method
    void fly() {
        System.out.println("Aeroplane class fly");
    }
}

class CargoPlane extends Aeroplane {
    // overriding method
    void fly() {
        System.out.println("CargoPlane flies at low altitude");
    }

    // specialized method
    void carryGoods() {
        System.out.println("CargoPlane carries goods");
    }
}

class PassengerPlane extends Aeroplane {
    // overriding method
    void fly() {
        System.out.println("PassengerPlane flies at high altitude");
    }

    // specialized method
    void carryPassenger() {
        System.out.println("PassengerPlane carries passenger");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        CargoPlane cargoPlane = new CargoPlane();
        cargoPlane.takeOff();
        cargoPlane.fly();
        cargoPlane.carryGoods();
    }
}
