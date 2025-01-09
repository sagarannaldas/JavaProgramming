package pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
//        int n = 6;
//        for ( int i = 1; i <= n; i++) //rows
//        {
//            for( int j = i; j < n; j++) //columns
//            {
//                System.out.print(" "); //spaces
//            }
//            int m = 2 * i - 1;
//            if( m <= n) {
//                for (int k = 0; k <= m; k++) { //stars
//                    System.out.print("*");
//                }
//                System.out.println(" ");
//            }
//        }

        System.out.println("Enter the numbe of rows");
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        for ( int i = 1; i < d; i = i + 2)
        {
            for ( int j = 0; j < (d - i) / 2 ; j++)
            {
                System.out.print(" ");
            }
            for ( int k = 0; k < i; k++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }
        for ( int i = d - 1; i > 0; i = i - 2)
        {
            for ( int j = 0; j < (d - i) / 2 ; j++)
            {
                System.out.print(" ");
            }
            for ( int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
