package encapsulation;

class Student {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(18);
        obj.setName("Rahul");
        obj.show();
    }
}
