package strings;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Virat");
        str.append("Kohli");
        System.out.println(str);

        StringBuffer str1 = new StringBuffer("Virat");
        str1.append("Kohli");
        System.out.println(str1);
    }
}
