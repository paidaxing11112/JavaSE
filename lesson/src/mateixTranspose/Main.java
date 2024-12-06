package mateixTranspose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] p = new int[n][m];
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < m;j++) {
                p[i][j] = sc.nextInt();
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                System.out.print(p[j][i] + " ");
            }
            System.out.println();
        }
    }
}
