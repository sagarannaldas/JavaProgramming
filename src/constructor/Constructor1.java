package constructor;

class Student {
    private int age;
    private String name;

    Student(){
        System.out.println("Zero parameterized constructor by programmer");
    }

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void disp(){
        System.out.println("Student name: " + name + " age:" + age);
    }

}

public class Constructor1 {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.disp();

        Student st2 = new Student(18,"rahul");
        st2.disp();
    }
}
