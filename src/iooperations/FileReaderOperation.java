package iooperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderOperation {
    public static void main(String[] args) {
        File dir = new File("Operations");
        File file = new File(dir, "notepad.txt");
        System.out.println(file.isFile());
        try {
            FileReader fileReader = new FileReader(file);
            int i = fileReader.read();
            while (i != -1) {
                System.out.print(i + "--------> ");
                System.out.println((char) i);
                i = fileReader.read();
            }

            // another approach efficient way

            FileReader fileReader1 = new FileReader(file);
            char[] fileChar = new char[(int) file.length()];
            fileReader1.read(fileChar);

            for(char ch: fileChar) {
                System.out.print(ch);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error... " + e);
        } catch (IOException e) {
            System.out.println("Error... " + e);
        }
    }
}
