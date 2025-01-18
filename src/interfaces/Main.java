package interfaces;

interface Computer {
    void compileCode();
}

class Desktop implements Computer {

    @Override
    public void compileCode() {
        System.out.println("3 Errors compiled fast");
    }
}

class Laptop implements Computer {

    @Override
    public void compileCode() {
        System.out.println("3 Errors compiled slow");
    }
}

class Developer {
    public void buildApp(Computer computer) {
        System.out.println("Building App");
        computer.compileCode();
    }
}


public class Main {
    public static void main(String[] args) {
//        Computer computer = new Laptop();
        Computer computer = new Desktop();
        Developer developer = new Developer();
        developer.buildApp(computer);
    }
}
