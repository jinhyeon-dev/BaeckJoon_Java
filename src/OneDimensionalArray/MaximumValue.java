package OneDimensionalArray;

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            if(max < nums[i]) {
                max = nums[i];
                index =+ i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}
