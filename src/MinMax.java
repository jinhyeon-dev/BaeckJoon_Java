import java.util.Scanner;

public class MinMax {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1000000;
        int max = -1000000;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if(min > nums[i]) {
                min = nums[i];
            }
            if(max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
