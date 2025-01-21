package important_apis_and_annotations;

class Plane {
    public void fly() {
        System.out.println("Plane flies at high altitudes");
    }
}

class CargoPlane extends Plane {
    // annotations
    @Override
    public void fly() {
        System.out.println("CargoPlane flies at low altitudes");
    }
}



public class Annotations {
    public static void main(String[] args) {
        Plane cargoplane = new CargoPlane();
        cargoplane.fly();
    }
}
