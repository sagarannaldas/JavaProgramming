package arrays;

public class Arrays2D {
    public static void main(String[] args) {
//        int nums[][] = new int[3][2];
//        nums[0][0] = 1;
//        nums[0][1] = 2;
//        nums[1][0] = 3;
//        nums[1][1] = 4;
//        nums[2][0] = 5;
//        nums[2][1] = 6;

        int nums[][] = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
