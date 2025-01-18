package iooperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterOperation {
    public static void main(String[] args) {
        File dir = new File("Operations");
        File file = new File(dir, "notepad.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write(65);
            printWriter.write("\n");
            printWriter.print("Java");
            printWriter.println(" ");
            printWriter.print(100);
            printWriter.println(true);
            printWriter.println(4.0);
            printWriter.println('a');
//            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error... " + e);
        }
    }
}
