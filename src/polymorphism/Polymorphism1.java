package polymorphism;

class Aeroplane1 {
    void takeOff() {
        System.out.println("Aeroplane  is taking off");
    }

    void fly() {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane1 extends Aeroplane1 {
    void takeOff() {
        System.out.println("CargoPlane requires longer size runway");
    }

    void fly() {
        System.out.println("CargoPlane flies at low altitude");
    }
}

class PassengerPlane1 extends Aeroplane1 {
    void takeOff() {
        System.out.println("PassengerPlane requires medium size runway");
    }

    void fly() {
        System.out.println("PassengerPlane flies at medium altitude");
    }
}

class FighterPlane1 extends Aeroplane1 {
    void takeOff() {
        System.out.println("FighterPlane1 requires small size runway");
    }

    void fly() {
        System.out.println("FighterPlane1 flies at high altitude");
    }
}

class Airport {
    public void poly(Aeroplane1 ref) {
        ref.takeOff();
        ref.fly();
        System.out.println("--------------------------------");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {

        CargoPlane1 cargoPlane1 = new CargoPlane1();

        PassengerPlane1 passengerPlane1 = new PassengerPlane1();

        FighterPlane1 fighterPlane1 = new FighterPlane1();

        Airport airport = new Airport();

        airport.poly(cargoPlane1);
        airport.poly(passengerPlane1);
        airport.poly(fighterPlane1);

    }
}
