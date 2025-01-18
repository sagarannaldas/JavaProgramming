package iooperations;

import java.io.*;

public class BufferedReaderOperation {
    public static void main(String[] args) {
        File dir = new File("Operations");
        File file = new File(dir, "notepad.txt");
        System.out.println(file.isFile());
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Error... " + e);
        }
    }
}
