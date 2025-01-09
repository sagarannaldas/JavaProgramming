package pattern;

public class Pattern1 {
    public static void main(String[] args) {
        int a = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a+=1;
                System.out.print(a);
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
