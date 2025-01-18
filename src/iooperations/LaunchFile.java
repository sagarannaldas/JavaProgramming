package iooperations;

import java.io.File;
import java.io.IOException;

public class LaunchFile {
    public static void main(String[] args) throws IOException {
        // To create file
        File file = new File("pw.txt");
        System.out.println(file.exists()); // false
        file.createNewFile();
        System.out.println(file.exists()); // true

        // To create directory
        File dir = new File("Folder");
        System.out.println(dir.exists()); // false
        dir.mkdir();
        System.out.println(dir.exists()); // true
    }
}
