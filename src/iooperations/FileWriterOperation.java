package iooperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOperation {
    public static void main(String[] args) {
        File dir = new File("Operations");
        System.out.println(dir.isDirectory());
        dir.mkdir();

        File file = new File(dir, "notepad.txt");
        System.out.println(file.isFile());
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error... " + e);
        }

        try {
            // by passing true existing data won't disturb
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("PW");
            fileWriter.write("\n");
            fileWriter.write(65);
            fileWriter.write("\n");
            fileWriter.write(97);
            fileWriter.write("\n");
            char[] ch = {'j', 'a', 'v', 'a'};
            fileWriter.write(ch);
            fileWriter.write("\n");
            fileWriter.close(); // this is mandatory to call to store data in file otherwise it'll stay in buffer expecting more data input to come
//            fileWriter.flush(); // both are same
            System.out.println("Open notepad.txt to see result");
        } catch (IOException e) {
            System.out.println("Error... " + e);
        }

    }
}
