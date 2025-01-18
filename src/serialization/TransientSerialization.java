package serialization;

import java.io.*;

// selective serialization

class Student implements Serializable {
    private String name;
    transient private String teacher; // transient member will not participate in serialization
    private int roll;

    public Student(String name, String teacher, int roll) {
        this.name = name;
        this.teacher = teacher;
        this.roll = roll;
    }

    public void disp() {
        System.out.println(name);
        System.out.println(teacher);
        System.out.println(roll);
    }

}

public class TransientSerialization {
    public static void main(String[] args) {
        Student student = new Student("pranay", "uma", 1);
        student.disp();

        String path = "Operations/notepad.txt";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("Error... " + e);
        }


        System.out.println("--------------------------------");

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
                try {
                    Student student1 = (Student) objectInputStream.readObject();
                    student1.disp();
                    objectInputStream.close();
                } catch (ClassNotFoundException e) {
                    System.out.println("Error... " + e);
                }
            } catch (IOException e) {
                System.out.println("Error... " + e);            }

        } catch (FileNotFoundException e) {
            System.out.println("Error... " + e);
        }

    }
}
