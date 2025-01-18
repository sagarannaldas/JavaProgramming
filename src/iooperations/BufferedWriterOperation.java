package iooperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterOperation {
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
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Java");
            bufferedWriter.newLine();
            bufferedWriter.write(65); // 65 corresponding char will be stored
            bufferedWriter.newLine();
            char[] ch = {'p', 'w', 's', 'k', 'i', 'l', 'l', 's'};
            bufferedWriter.write(ch);

            bufferedWriter.flush(); // recommended way
            bufferedWriter.close(); // this is mandatory to call to store data in file otherwise it'll stay in buffer expecting more data input to come

            System.out.println("Open notepad.txt to see result");
        } catch (IOException e) {
            System.out.println("Error... " + e);
        }

    }
}
