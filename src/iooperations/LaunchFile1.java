package iooperations;

import java.io.File;
import java.io.IOException;

public class LaunchFile1 {
    public static void main(String[] args) {
        File dir = new File("PWJAVA");
//        System.out.println(dir.isDirectory());
        dir.mkdir();
        System.out.println("dir is refering to directory PWJAVA: " + dir.isDirectory());


        File file1 = new File(dir, "pwskill.txt");

        try {
            file1.createNewFile();
        } catch (IOException e) {
            System.out.println("Error... " + e);
        }

        System.out.println("file is refering to pwskill.txt " + file1.isFile());

        // checking count of files and folders in a particular directory
        int count = 0;

        String path = "/Users/sagarannaldas/Documents/JavaProgramming";
        File f = new File(path);
        String[] fileList = f.list();

        for (String filename : fileList) {
            count++;
            System.out.println(filename);
        }

        System.out.println("No. of files are: " + count);

    }
}
