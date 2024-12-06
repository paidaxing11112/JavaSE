package Text;

import java.util.Scanner;

/**
 * Text7类提供了两个方法来加密和解密一个整数
 * 加密过程包括将每个数字加上5，然后取模10，再将结果反转
 * 解密过程则是将加密后的数字反转，然后每个数字减去5，并确保结果在0-9之间
 *
 * @author gan
 */
public class Text7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 加密输入的数字
        System.out.println(encryption(num));
        // 解密输入的数字
        System.out.println(decrypt(encryption(num)));
    }

    /**
     * 解密一个整数
     * 该方法首先确定数字的位数，然后逐位解密
     * 解密过程包括反转数字，将每个数字加上10（如果小于5），然后减去5
     *
     * @param num 待解密的整数
     * @return 解密后的整数
     */
    public static int decrypt(int num) {
        int temp = num;
        int count = 0;
        while (num > 0){
            num = num / 10;
            count++;
        }
        int[] a = new int[count];
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = temp % 10;
            temp = temp / 10;
        }
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int p = a[i];
            a[i] = a[j];
            a[j] = p;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 5) a[i] += 10;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] -= 5;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum * 10 + a[i];
        }
        return sum;
    }

    /**
     * 加密一个整数
     * 该方法首先确定数字的位数，然后逐位加密
     * 加密过程包括将每个数字加上5，取模10，然后反转结果
     *
     * @param num 待加密的整数
     * @return 加密后的整数
     */
    public static int encryption(int num){
        int temp = num;
        int count = 0;
        while (num > 0){
            num = num / 10;
            count++;
        }
        int[] a = new int[count];
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = temp % 10;
            temp = temp / 10;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] += 5;
            a[i] = a[i] % 10;
        }
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int p = a[i];
            a[i] = a[j];
            a[j] = p;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum * 10 + a[i];
        }
        return sum;
    }
}
