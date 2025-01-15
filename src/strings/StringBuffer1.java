package strings;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Virat");
        str.append("Kohli");
        System.out.println(str);

        System.out.println("-----------------------");

        StringBuffer str1 = new StringBuffer("Virat");
        str1.append("Kohli");
        System.out.println(str1);

        System.out.println("-----------------------");

        StringBuilder str2 = new StringBuilder();
        System.out.println(str2.capacity());
        str2.append("abcdefghijklmnop");
        System.out.println(str2.capacity());
        str2.append("q");
        System.out.println(str2.capacity());
        System.out.println(str2.length());

        System.out.println("-----------------------");
        StringBuffer str3 = new StringBuffer();
        System.out.println(str3.capacity());

        System.out.println("-----------------------");

        StringBuffer str4 = new StringBuffer("Sachin");
        System.out.println(str4);
        System.out.println(str4.capacity());
        System.out.println(str4.charAt(1));
        str4.setCharAt(1, 'A');
        System.out.println(str4);

        System.out.println("-----------------------");

        StringBuffer str5 = new StringBuffer(150);
        System.out.println(str5.capacity());
        str5.append("java");
        System.out.println(str5);
        str5.trimToSize();
        System.out.println(str5.capacity());
    }
}
