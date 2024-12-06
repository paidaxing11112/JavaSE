package Text10_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = i;
            }
            int m = sc.nextInt();
            System.out.println(a[m]);
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }finally {
            sc.close();
        }
    }
}
