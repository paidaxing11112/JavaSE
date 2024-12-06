package Text;

import java.util.Random;

public class text3 {
    // 生成随机验证码,前四个为大小写字母,后一位为数字
    public static void main(String[] args) {
        char[] a = new char[52];
        for (int i = 0;i < a.length;i++) {
            if (i < 26) {
                a[i] = (char)(i + 97);
            }
            else {
                a[i] = (char)(i + 65 - 26);
            }
        }
        Random random = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(52);
            str += a[index];
        }
        str += random.nextInt(10);
        System.out.println(str);
    }
}
