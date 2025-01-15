package staticfunctionality;

import java.util.Scanner;

class Farmer {
    static float rateOfInterest;
    int principalAmount;
    float timeDuration;
    float simpleInterest;

    static {
        rateOfInterest = 4.5f;
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount required");
        principalAmount = scan.nextInt();
        System.out.println("Please enter the time duration");
        timeDuration = scan.nextFloat();
    }

    void compute() {
        simpleInterest = (principalAmount * timeDuration * rateOfInterest) / 100f;
    }

    void disp() {
        System.out.println("Simple interest is: " + simpleInterest);
    }
}

public class LaunchFarmer {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer();
        farmer1.input();
        farmer1.compute();
        farmer1.disp();

        Farmer farmer2 = new Farmer();
        farmer2.input();
        farmer2.compute();
        farmer2.disp();
    }
}
