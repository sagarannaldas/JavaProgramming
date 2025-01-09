package arrays;

public class ForEachLoop {
    public static void main(String []args) {

        int nums[] = {1,2,3,4,5,6};

        int nums1[][] = {
                {5, 2, 3, 4},
                {3, 4},
                {9, 4, 7}
        };

        for(int result: nums) {
            System.out.print(result + " ");
        }

        System.out.println();
        System.out.println("------------------------------------------------------");

        for (int[] result: nums1) {
            for (int result1: result) {
                System.out.print(result1 + " ");
            }
            System.out.println();
        }
    }
}
