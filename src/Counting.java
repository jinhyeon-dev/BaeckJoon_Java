import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] nums = new int[100];
        int count = 0;

        for (int i = 0; i < a; i++) {
            nums[i] = sc.nextInt();
        }

        int b = sc.nextInt();

        for (int j = 0; j < a; j++) {
            if (nums[j] == b) {
                count++;
            }
        }
        System.out.println(count);
    }
}