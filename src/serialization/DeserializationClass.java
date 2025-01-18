package serialization;


import java.io.*;

public class DeserializationClass {
    public static void main(String[] args) {

        String path = "Operations/notepad.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); // efficient and fast
                ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
                try {
                    Cricketer crt = (Cricketer) objectInputStream.readObject();
                    crt.disp();

                } catch (ClassNotFoundException e) {
                    System.out.println("Error... " + e);
                }

            } catch (IOException e) {
                System.out.println("Error... " + e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error... " + e);
        }
    }
}
