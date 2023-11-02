package OneDimensionalArray;

import java.util.Scanner;

public class NoHomework {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] std = new int[30];
        for (int i = 0; i < 28; i++) {
            std[i] = sc.nextInt();
        }
        for (int j = 0; j < 30; j++) {
            if (std[j] == 0) {
                System.out.println(j);
            }
        }
    }
}
