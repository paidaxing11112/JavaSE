package baseConversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[100];
        int i = 0;
        while (num != 0) {
            arr[i] = num % 2;
            num /=2;
            i++;
        }
        i--;
        for (; i >= 0; i--) {

            System.out.print(arr[i]);
        }
    }
}
