package constructor;

class Student1 {
    private int age;
    private String name;

    public Student1() {
        System.out.println("Default constructor is called");
        name = "rohan";
        age = 18;
    }

    public Student1(String name) {
        this.name = name;
        age = 19;
    }

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void disp() {
        System.out.println(age);
        System.out.println(name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.disp();

        Student1 st2 = new Student1("Rahul");
        st2.disp();

        Student1 st3 = new Student1(18, "Rohit");
        st3.disp();
    }
}
