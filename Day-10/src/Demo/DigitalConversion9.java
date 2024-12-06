package Demo;

import java.util.Scanner;

public class DigitalConversion9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            money = sc.nextInt();
            if (money > 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("数字无效,请请重新输入");
            }
        }
        String str = "";
        while(money != 0) {
            int ge = money % 10;
            String get = Conversion(ge);
            str = get + str;
            money /= 10;
        }
        int len = 7 - str.length();
        for (int i = 0; i < len; i++) {
            str = "零" + str;
        }

        String[] arr = {"佰","拾","万","千","佰","拾","元"};
        String conversionMoney = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            conversionMoney = conversionMoney + c + arr[i];
        }

        System.out.println(conversionMoney);

    }
    public static String Conversion(int number) {
        String[] arr={"零","壹","贰","叁","肆","無","陆","柒","捌","玖"};
        return arr[number];
    }
}
