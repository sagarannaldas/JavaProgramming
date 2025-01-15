package constructor;

class Student2 {
    private int age;
    private String name;

    public Student2() {
//        super(); Parent class constructor called
        this(19,"rohit");
        System.out.println("Default constructor is called");
        name = "rohan";
        age = 18;
    }

    public Student2(String name) {
        this();
        this.name = name;
        age = 19;
    }

    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void disp() {
        System.out.println(age);
        System.out.println(name);
    }
}

public class SuperThisMethods {
    public static void main(String[] args) {
        Student2 st1 = new Student2();
        st1.disp();

        Student2 st2 = new Student2("Rahul");
        st2.disp();

//        Student2 st3 = new Student2(18, "Rohit");

    }
}
