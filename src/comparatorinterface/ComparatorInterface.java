package comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int marks;
    int age;
    String name;

    public Student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

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

    @Override
    public String toString() {
        return "Strudent{" +
                "marks=" + marks +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.age > b.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

class StudentMarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.marks > b.marks) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        Student student1 = new Student(45, 18, "Rohan");
        Student student3 = new Student(47, 17, "Mehu");
        Student student2 = new Student(46, 19, "Rohit");

        List<Student> list = new ArrayList();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        // it'll print data instead of object address bcz we override the toString method.
        System.out.println(list);

//        Collections.sort(list);

        StudentAgeComparator studentAgeComparator = new StudentAgeComparator();
        Collections.sort(list, studentAgeComparator);
        System.out.println(list);

        StudentMarksComparator studentMarksComparator = new StudentMarksComparator();
        Collections.sort(list, studentMarksComparator);
        System.out.println(list);

        // lambda expression
        Comparator<Student> studentAgesComparator = (Student a, Student b) -> {
            if (a.age > b.age) {
                return 1;
            } else {
                return -1;
            }
        };

    }
}
