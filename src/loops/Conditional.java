package loops;

public class Conditional {
    public static void main(String[] args) {
        int age = 31;

        // if else ladder
        if (age >= 18 && age < 60) {
            System.out.println("You're an adult");
        } else if (age >= 60) {
            System.out.println("You're old man");
        } else {
            System.out.println("You're still a kid");
        }

        // Nested if else
        if (age >= 18 && age <= 60) {
            if (age > 20 && age < 30) {
                System.out.println("You're in 20's");
            } else if (age >=30 && age <=40) {
                System.out.println("You're in 30's");
            } else {
                System.out.println("You're neither in 20's & 30's");
            }
        } else if(age > 60) {
            System.out.println("You're an old man");
        } else if (age >= 16 && age > 18) {
            System.out.println("You're teen");
        } else {
            System.out.println("You're still a kid");
        }
    }
}
