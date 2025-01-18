package serialization;

import java.io.*;

class Cricketer implements Serializable {
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}

public class SerializationClass {
    public static void main(String[] args) {
        Cricketer cricketer = new Cricketer("sachin", 44, 50000);
        cricketer.disp();
        String path = "Operations/notepad.txt";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream); // efficient method and fast
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
                objectOutputStream.writeObject(cricketer);
                objectOutputStream.flush();
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error... " + e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error... " + e);
        }
    }
}
